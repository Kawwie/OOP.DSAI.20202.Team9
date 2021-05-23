
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PlayScene  {
	
	
	//for drawing the board
	Line l1 = new Line();
	Line l2 = new Line();
	Line l3 = new Line();
	Line l4 = new Line();
	Line l5 = new Line();
	Line l6 = new Line();
	Line l7 = new Line();
	Line l8 = new Line();
	Line l9 = new Line();
	Arc l10 = new Arc(225, 300, 100, 100, 90, 180);
	Arc l11 = new Arc(725, 300, 100, 100, 270, 180);
	
	
	// for displaying score
	Text cell0 = new Text(175, 300, "5");
    Text cell1 = new Text(275, 250, "5");
    Text cell2 = new Text(375, 250, "5");
    Text cell3 = new Text(475, 250, "5");
    Text cell4 = new Text(575, 250, "5");
    Text cell5 = new Text(675, 250, "5");   
    Text cell11 = new Text(275, 350, "5");
    Text cell10 = new Text(375, 350, "5");    
    Text cell9 = new Text(475, 350, "5");
    Text cell8 = new Text(575, 350, "5");   
    Text cell7 = new Text(675, 350, "5");
    Text cell6 = new Text(775, 300, "5");	
    
    
    
    //for displaying score
    Text t1 = new Text(50, 500, "Player1 score: ");
    Text t2 = new Text(50, 100, "Player2 score: ");
    
    
    //for setting cell value and add actionlistener
    Rectangle r1 = new Rectangle(225, 200, 100, 100);
    Rectangle r2 = new Rectangle(325, 200, 100, 100);
    Rectangle r3 = new Rectangle(425, 200, 100, 100);
    Rectangle r4 = new Rectangle(525, 200, 100, 100);
    Rectangle r5 = new Rectangle(625, 200, 100, 100);
    Rectangle r11 = new Rectangle(225, 300, 100, 100);
    Rectangle r10 = new Rectangle(325, 300, 100, 100);
    Rectangle r9 = new Rectangle(425, 300, 100, 100);
    Rectangle r8 = new Rectangle(525, 300, 100, 100);
    Rectangle r7 = new Rectangle(625, 300, 100, 100);
    
    
    //for choosing direction clockwise or counter clockwise
    MenuItem i11 = new MenuItem("clockwise");
    MenuItem i12 = new MenuItem("counter_clockwise");
    MenuItem i21 = new MenuItem("clockwise");
    MenuItem i22 = new MenuItem("counter_clockwise");
    MenuItem i31 = new MenuItem("clockwise");
    MenuItem i32 = new MenuItem("counter_clockwise");
    MenuItem i41 = new MenuItem("clockwise");
    MenuItem i42 = new MenuItem("counter_clockwise");
    MenuItem i51 = new MenuItem("clockwise");
    MenuItem i52 = new MenuItem("counter_clockwise");
    MenuItem i71 = new MenuItem("clockwise");
    MenuItem i72 = new MenuItem("counter_clockwise");
    MenuItem i81 = new MenuItem("clockwise");
    MenuItem i82 = new MenuItem("counter_clockwise");
    MenuItem i91 = new MenuItem("clockwise");
    MenuItem i92 = new MenuItem("counter_clockwise");
    MenuItem i101 = new MenuItem("clockwise");
    MenuItem i102 = new MenuItem("counter_clockwise");
    MenuItem i111 = new MenuItem("clockwise");
    MenuItem i112 = new MenuItem("counter_clockwise");
    
    //popup context menu 
    ContextMenu menu1 = new ContextMenu(i11, i12);
    ContextMenu menu2 = new ContextMenu(i21, i22);
    ContextMenu menu3 = new ContextMenu(i31, i32);
    ContextMenu menu4 = new ContextMenu(i41, i42);
    ContextMenu menu5 = new ContextMenu(i51, i52);
    ContextMenu menu7 = new ContextMenu(i71, i72);
    ContextMenu menu8 = new ContextMenu(i81, i82);
    ContextMenu menu9 = new ContextMenu(i91, i92);
    ContextMenu menu10 = new ContextMenu(i101, i102);
    ContextMenu menu11 = new ContextMenu(i111, i112);
    
	
	O_an_quan a1 = new O_an_quan();
	
	
	public void printBoard() {
		cell0.setText(""+a1.board[0]);
		cell1.setText(""+a1.board[1]);
		cell2.setText(""+a1.board[2]);
		cell3.setText(""+a1.board[3]);
		cell4.setText(""+a1.board[4]);
		cell5.setText(""+a1.board[5]);
		cell7.setText(""+a1.board[7]);
		cell8.setText(""+a1.board[8]);
		cell9.setText(""+a1.board[9]);
		cell10.setText(""+a1.board[10]);
		cell11.setText(""+a1.board[11]);
		cell6.setText(""+a1.board[6]);
		t1.setText("Player 1 score: "+a1.player1.score);
		t2.setText("Player 2 score: "+a1.player2.score);
	}
	
	
	public Scene playScene() {
		
		   
		   
	   //drawing the board	   
       l1.setStartX(200+25);
       l1.setEndX(200+25);
       l1.setStartY(200);
       l1.setEndY(400);       
       l2.setStartX(300+25);
       l2.setEndX(300+25);
       l2.setStartY(200);
       l2.setEndY(400);       
       l3.setStartX(400+25);
       l3.setEndX(400+25);
       l3.setStartY(200);
       l3.setEndY(400);      
       l4.setStartX(500+25);
       l4.setEndX(500+25);
       l4.setStartY(200);
       l4.setEndY(400);     
       l5.setStartX(600+25);
       l5.setEndX(600+25);
       l5.setStartY(200);
       l5.setEndY(400);     
       l6.setStartX(700+25);
       l6.setEndX(700+25);
       l6.setStartY(200);
       l6.setEndY(400);      
       l7.setStartX(200+25);
       l7.setEndX(700+25);
       l7.setStartY(200);
       l7.setEndY(200);     
       l8.setStartX(200+25);
       l8.setEndX(700+25);
       l8.setStartY(400);
       l8.setEndY(400);     
       l9.setStartX(200+25);
       l9.setEndX(700+25);
       l9.setStartY(300);
       l9.setEndY(300);     
       l10.setFill(null);
       l10.setStrokeWidth(1);
       l10.setStroke(Color.BLACK);      
       l11.setFill(null);
       l11.setStroke(Color.BLACK);
       l11.setStrokeWidth(1);
       
       
       //setting color for cell
       r1.setFill(Color.ANTIQUEWHITE);
       r2.setFill(Color.ANTIQUEWHITE);       
       r3.setFill(Color.ANTIQUEWHITE);       
       r4.setFill(Color.ANTIQUEWHITE);     
       r5.setFill(Color.ANTIQUEWHITE);     
       r11.setFill(Color.ANTIQUEWHITE);
       r10.setFill(Color.ANTIQUEWHITE);      
       r9.setFill(Color.ANTIQUEWHITE);     
       r8.setFill(Color.ANTIQUEWHITE);       
       r7.setFill(Color.ANTIQUEWHITE);
       
       
       Text turn = new Text("player 1");
       turn.setX(750);
       turn.setY(100);
       
       Text finish = new Text("");
       
       finish.setFont(Font.font(40));
       finish.setX(400);
       finish.setY(100);
       

       r1.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu1.show(r1, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i11.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(1, "clockwise");
    		    
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
       i12.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(1, "counter_clockwise");
    		   
    		   
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
       
       
       
       
       

       r2.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu2.show(r2, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i21.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(2, "clockwise");
    		   
    		   
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
       i22.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(2, "counter_clockwise");
    		  
    		   
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
       
       
       
       
       

       r3.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu3.show(r3, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i31.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(3, "clockwise");
    		   
    		   
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
       i32.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(3, "counter_clockwise");
    		   
    		   
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
       
       
       
       
       

       r4.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu4.show(r4, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i41.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(4, "clockwise");
    		   
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
       i42.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(4, "counter_clockwise");
    		
    		   
    		   
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
       
       
       

       r5.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu5.show(r5, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i51.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(5, "clockwise");
    		
    		   
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
       i52.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(5, "counter_clockwise");
    		   
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
       
       
       
       
       

       r7.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu7.show(r7, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i71.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(7, "clockwise");
    		  
    		   
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
       i72.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(7, "counter_clockwise");
    		   
    		   
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
       
       
       
       
       
       

       r8.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu8.show(r8, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i81.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(8, "clockwise");
    		   
    		   
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
       i82.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(8, "counter_clockwise");
    		   
    		   
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
       
       
       
       

       r9.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu9.show(r9, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i91.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(9, "clockwise");
    		  
    		   
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
       i92.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(9, "counter_clockwise");
    		  
    		   
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
       
       
       
       
       
       

       r10.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu10.show(r10, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i101.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(10, "clockwise");
    		   
    		   
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
       i102.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(10, "counter_clockwise");
    		   
    		   
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
       
       
    

       r11.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
    	   @Override
    	   public void handle(ContextMenuEvent e) {
    		   menu11.show(r11, e.getScreenX(), e.getSceneY());
   
    	   }
       });
       
       i111.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(11, "clockwise");
    		   
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
       i112.setOnAction(new EventHandler<ActionEvent>() {
    	   @Override
    	   public void handle(ActionEvent e) {
    		   a1.move(11, "counter_clockwise");
    		  
    		   
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
    
        
	    Group root = new Group(finish, turn, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11, t1, t2);
	    root.getChildren().addAll(cell0, cell1, cell2, cell3, cell4, cell5, cell7, cell8, cell9, cell10, cell11, cell6);
	         
	    Scene playScene = new Scene(root, 1000, 600, Color.WHEAT);  
	    
	    
	    return playScene;
	 

	}
	
}
