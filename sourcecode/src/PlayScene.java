
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PlayScene  {
	
	
	//for drawing the board
	
	
	Line l1 = new Line(225, 200, 225, 400);
	Line l2 = new Line(325, 200, 325, 400);
	Line l3 = new Line(425, 200, 425, 400);
	Line l4 = new Line(525, 200, 525, 400);
	Line l5 = new Line(625, 200, 625, 400);
	Line l6 = new Line(725, 200, 725, 400);
	Line l7 = new Line(225, 200, 725, 200);
	Line l8 = new Line(225, 300, 725, 300);
	Line l9 = new Line(225, 400, 725, 400);
	Arc l10 = new Arc(225, 300, 100, 100, 90, 180);
	Arc l11 = new Arc(725, 300, 100, 100, 270, 180);
	
	
	
	// for displaying score
	Text cell0 = new Text(175, 300, "5");
    Text cell6 = new Text(775, 300, "5");	
    
    
    
    //for displaying score
    Text t1 = new Text(50, 500, "Player1 score: ");
    Text t2 = new Text(50, 100, "Player2 score: ");
    
    
    //for setting cell value and add actionlistener
    NormalCell c1 = new NormalCell(225, 200, 1);
    NormalCell c2 = new NormalCell(325, 200, 2);
    NormalCell c3 = new NormalCell(425, 200, 3);
    NormalCell c4 = new NormalCell(525, 200, 4);
    NormalCell c5 = new NormalCell(625, 200, 5);
    NormalCell c11 = new NormalCell(225, 300, 11);
    NormalCell c10 = new NormalCell(325, 300, 10);
    NormalCell c9 = new NormalCell(425, 300, 9);
    NormalCell c8 = new NormalCell(525, 300, 8);
    NormalCell c7 = new NormalCell(625, 300, 7);
    
    
    // determine play1 go first
    Text turn = new Text(750, 100, "player 1");
    
    
    //show up when finish
    Text finish = new Text(400, 100, "");

	
	O_an_quan a1 = new O_an_quan();
	
	
	// set actionlistener for each cell
	public void setActionListener(NormalCell i) {
		
		i.clockwise.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(i.pos, "clockwise");
	    		    
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
	    		   printBoard();
	    		   
	    		   if(a1.checkWinning() == true) {
	    			   finish.setText("FINISH");
	    			   for(int i=1;i<=5;i++) {
	    					a1.player2.score += a1.board[i];
	    				}
	    				for(int i=11;i>=7;i--) {
	    					a1.player1.score += a1.board[i];
	    				}
	    				t1.setText("Player 1 score: "+a1.player1.score);
	    	    		t2.setText("Player 2 score: "+a1.player2.score);
	    				
	    		   }
	    		   O_an_quan.turn +=1;
	    		   if( a1.checkHavePiece() == false) {
	    			   printBoard();   
	    		   }
	    		   
	    	   }
	       });
		
       i.counter_clockwise.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(i.pos, "counter_clockwise");
    		   
    		   
    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
    		   printBoard();
    		   if(a1.checkWinning() == true) {
    			   finish.setText("FINISH");
    			   for(int i=1;i<=5;i++) {
    					a1.player2.score += a1.board[i];
    				}
    				for(int i=11;i>=7;i--) {
    					a1.player1.score += a1.board[i];
    				}
    				t1.setText("Player 1 score: "+a1.player1.score);
    	    		t2.setText("Player 2 score: "+a1.player2.score);
    				
    		   }
    		   O_an_quan.turn +=1;
    		   if( a1.checkHavePiece() == false) {
    			   printBoard();

    			   
    		   }
    		   
    		   
    	   }
       });
		
		
	}
	
	
	
	public void printBoard() {
		cell0.setText(""+a1.board[0]);
		c1.text.setText(""+a1.board[1]);
		c2.text.setText(""+a1.board[2]);
		c3.text.setText(""+a1.board[3]);
		c4.text.setText(""+a1.board[4]);
		c5.text.setText(""+a1.board[5]);
		c7.text.setText(""+a1.board[7]);
		c8.text.setText(""+a1.board[8]);
		c9.text.setText(""+a1.board[9]);
		c10.text.setText(""+a1.board[10]);
		c11.text.setText(""+a1.board[11]);
		cell6.setText(""+a1.board[6]);
		t1.setText("Player 1 score: "+a1.player1.score);
		t2.setText("Player 2 score: "+a1.player2.score);
	}
	
	
	public Scene playScene() {
		
		   
	   //drawing the board	   
         
       l10.setFill(null);
       l10.setStrokeWidth(1);
       l10.setStroke(Color.BLACK);      
       l11.setFill(null);
       l11.setStroke(Color.BLACK);
       l11.setStrokeWidth(1);
       
       

       
       //set font for finish
       finish.setFont(Font.font(40));
       
       this.setActionListener(c1);
       this.setActionListener(c2);
       this.setActionListener(c3);
       this.setActionListener(c4);
       this.setActionListener(c5);
       this.setActionListener(c7);
       this.setActionListener(c8);
       this.setActionListener(c9);
       this.setActionListener(c10);
       this.setActionListener(c11);
       
	   Group root = new Group(finish, turn, t1, t2, cell0, cell6);
	    
	   root.getChildren().addAll(c1.rectangle, c1.text);
	   root.getChildren().addAll(c2.rectangle, c2.text);
	   root.getChildren().addAll(c3.rectangle, c3.text);
	   root.getChildren().addAll(c4.rectangle, c4.text);
	   root.getChildren().addAll(c5.rectangle, c5.text);
	   root.getChildren().addAll(c7.rectangle, c7.text);
	   root.getChildren().addAll(c8.rectangle, c8.text);
	   root.getChildren().addAll(c9.rectangle, c9.text);
	   root.getChildren().addAll(c10.rectangle, c10.text);
	   root.getChildren().addAll(c11.rectangle, c11.text);
	   
	   root.getChildren().addAll(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11);
	   
	   root.getChildren().addAll(c1.num_stone);
	   root.getChildren().addAll(c2.num_stone);
	   root.getChildren().addAll(c3.num_stone);
	   root.getChildren().addAll(c4.num_stone);
	   root.getChildren().addAll(c5.num_stone);
	   root.getChildren().addAll(c7.num_stone);
	   root.getChildren().addAll(c8.num_stone);
	   root.getChildren().addAll(c9.num_stone);
	   root.getChildren().addAll(c10.num_stone);
	   root.getChildren().addAll(c11.num_stone);
	 
	          
	   Scene playScene = new Scene(root, 1000, 600, Color.WHEAT);  
	  
	   return playScene;
	}
	
}
