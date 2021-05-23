import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GUI extends Application {
	@Override
	public void start(Stage stage) {
		
		 O_an_quan a1 = new O_an_quan();
		 
			
	       
	       
		   
		   
	      //Creating a Path 
		   Line l1 = new Line();
	       l1.setStartX(200+25);
	       l1.setEndX(200+25);
	       l1.setStartY(200);
	       l1.setEndY(400);
	       Line l2 = new Line();
	       l2.setStartX(300+25);
	       l2.setEndX(300+25);
	       l2.setStartY(200);
	       l2.setEndY(400);
	       Line l3 = new Line();
	       l3.setStartX(400+25);
	       l3.setEndX(400+25);
	       l3.setStartY(200);
	       l3.setEndY(400);
	       Line l4 = new Line();
	       l4.setStartX(500+25);
	       l4.setEndX(500+25);
	       l4.setStartY(200);
	       l4.setEndY(400);
	       Line l5 = new Line();
	       l5.setStartX(600+25);
	       l5.setEndX(600+25);
	       l5.setStartY(200);
	       l5.setEndY(400);
	       Line l6 = new Line();
	       l6.setStartX(700+25);
	       l6.setEndX(700+25);
	       l6.setStartY(200);
	       l6.setEndY(400);
	       Line l7 = new Line();
	       l7.setStartX(200+25);
	       l7.setEndX(700+25);
	       l7.setStartY(200);
	       l7.setEndY(200);
	       Line l8 = new Line();
	       l8.setStartX(200+25);
	       l8.setEndX(700+25);
	       l8.setStartY(400);
	       l8.setEndY(400);
	       Line l9 = new Line();
	       l9.setStartX(200+25);
	       l9.setEndX(700+25);
	       l9.setStartY(300);
	       l9.setEndY(300);
	       Arc l10 = new Arc(225, 300, 100, 100, 90, 180);
	       l10.setFill(null);
	       l10.setStrokeWidth(1);
	       l10.setStroke(Color.BLACK);
	       Arc l11 = new Arc(725, 300, 100, 100, 270, 180);
	       l11.setFill(null);
	       l11.setStroke(Color.BLACK);
	       l11.setStrokeWidth(1);
	       
	       
	       Rectangle r1 = new Rectangle(225, 200, 100, 100);
	       r1.setFill(Color.ANTIQUEWHITE);

	       Rectangle r2 = new Rectangle(325, 200, 100, 100);
	       r2.setFill(Color.ANTIQUEWHITE);
	       
	       Rectangle r3 = new Rectangle(425, 200, 100, 100);
	       r3.setFill(Color.ANTIQUEWHITE);
	       
	       Rectangle r4 = new Rectangle(525, 200, 100, 100);
	       r4.setFill(Color.ANTIQUEWHITE);
	       
	       Rectangle r5 = new Rectangle(625, 200, 100, 100);
	       r5.setFill(Color.ANTIQUEWHITE);
	       
	       Rectangle r11 = new Rectangle(225, 300, 100, 100);
	       r11.setFill(Color.ANTIQUEWHITE);
	       
	       Rectangle r10 = new Rectangle(325, 300, 100, 100);
	       r10.setFill(Color.ANTIQUEWHITE);
	       
	       Rectangle r9 = new Rectangle(425, 300, 100, 100);
	       r9.setFill(Color.ANTIQUEWHITE);
	       
	       Rectangle r8 = new Rectangle(525, 300, 100, 100);
	       r8.setFill(Color.ANTIQUEWHITE);
	       
	       Rectangle r7 = new Rectangle(625, 300, 100, 100);
	       r7.setFill(Color.ANTIQUEWHITE);
	       
	       
	       Text turn = new Text("player 1");
	       turn.setX(750);
	       turn.setY(100);
	       
	       Text finish = new Text("");
	       
	       finish.setFont(Font.font(40));
	       finish.setX(400);
	       finish.setY(100);
	       
	       
	       
	       
	       
	       Text t1 = new Text("Player1 score: ");
	       Text t2 = new Text("Player2 score: ");
	       t2.setX(50);
	       t2.setY(100);
	       t1.setX(50);
	       t1.setY(500);
	       
	       
	       
	       
	       Text cell0 = new Text("5");
	       cell0.setX(175);
	       cell0.setY(300);
	       
	       Text cell1 = new Text("5");
	       cell1.setX(275);
	       cell1.setY(250);
	       
	       Text cell2 = new Text("5");
	       cell2.setX(375);
	       cell2.setY(250);
	       
	       Text cell3 = new Text("5");
	       cell3.setX(475);
	       cell3.setY(250);
	       
	       Text cell4 = new Text("5");
	       cell4.setX(575);
	       cell4.setY(250);
	       
	       Text cell5 = new Text("5");
	       cell5.setX(675);
	       cell5.setY(250);
	       
	       Text cell11 = new Text("5");
	       cell11.setX(275);
	       cell11.setY(350);
	       
	       Text cell10 = new Text("5");
	       cell10.setX(375);
	       cell10.setY(350);
	       
	       Text cell9 = new Text("5");
	       cell9.setX(475);
	       cell9.setY(350);
	       
	       Text cell8 = new Text("5");
	       cell8.setX(575);
	       cell8.setY(350);
	       
	       Text cell7 = new Text("5");
	       cell7.setX(675);
	       cell7.setY(350);
	       
	       Text cell6 = new Text("5");
	       cell6.setX(775);
	       cell6.setY(300);
	       
	       
	       
	       
	       
	       
	       
	       ContextMenu menu1 = new ContextMenu();
	       MenuItem i11 = new MenuItem("clockwise");
	       MenuItem i12 = new MenuItem("counter_clockwise");
	      
	       menu1.getItems().addAll(i11, i12);
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
	    		   
	    	   }
	       });
	       i12.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(1, "counter_clockwise");
	    		   
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    	   }
	       });
	       
	       
	       
	       
	       
	       
	       ContextMenu menu2 = new ContextMenu();
	       MenuItem i21 = new MenuItem("clockwise");
	       MenuItem i22 = new MenuItem("counter_clockwise");
	      
	       menu2.getItems().addAll(i21, i22);
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
	    		   
	    		   
	    		   
	    	   }
	       });
	       i22.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(2, "counter_clockwise");
	    		  
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    		   
	    		   
	    		   
	    	   }
	    	   
	       });
	       
	       
	       
	       
	       
	       
	       ContextMenu menu3 = new ContextMenu();
	       MenuItem i31 = new MenuItem("clockwise");
	       MenuItem i32 = new MenuItem("counter_clockwise");
	      
	       menu3.getItems().addAll(i31, i32);
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
	    		   
	    		   
	    		   
	    		   
	    	   }
	       });
	       i32.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(3, "counter_clockwise");
	    		   
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    		   
	    	   }
	       });
	       
	       
	       
	       
	       
	       
	       ContextMenu menu4 = new ContextMenu();
	       MenuItem i41 = new MenuItem("clockwise");
	       MenuItem i42 = new MenuItem("counter_clockwise");
	      
	       menu4.getItems().addAll(i41, i42);
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
	    		   
	    		   
	    	   }
	       });
	       i42.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(4, "counter_clockwise");
	    		
	    		   
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    	   }
	    		   
	    		   
	       });
	       
	       
	       
	       
	       
	       ContextMenu menu5 = new ContextMenu();
	       MenuItem i51 = new MenuItem("clockwise");
	       MenuItem i52 = new MenuItem("counter_clockwise");
	      
	       menu5.getItems().addAll(i51, i52);
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
	    		   
	    		   
	    		   
	    	   }
	       });
	       i52.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(5, "counter_clockwise");
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	 
	    	   }
	       });
	       
	       
	       
	       
	       
	       
	       ContextMenu menu7 = new ContextMenu();
	       MenuItem i71 = new MenuItem("clockwise");
	       MenuItem i72 = new MenuItem("counter_clockwise");
	      
	       menu7.getItems().addAll(i71, i72);
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
	    		   
	    		   
	    	   }
	       });
	       i72.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(7, "counter_clockwise");
	    		   
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    	   }
	       });
	       
	       
	       
	       
	       
	       
	       
	       
	       ContextMenu menu8 = new ContextMenu();
	       MenuItem i81 = new MenuItem("clockwise");
	       MenuItem i82 = new MenuItem("counter_clockwise");
	      
	       menu8.getItems().addAll(i81, i82);
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
	    		   
	    		   
	    		   
	    	   }
	       });
	       i82.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(8, "counter_clockwise");
	    		   
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    	   }
	       });
	       
	       
	       
	       
	       
	       ContextMenu menu9 = new ContextMenu();
	       MenuItem i91 = new MenuItem("clockwise");
	       MenuItem i92 = new MenuItem("counter_clockwise");
	      
	       menu9.getItems().addAll(i91, i92);
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
	    		   
	    		   
	    		   
	    	   }
	       });
	       i92.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(9, "counter_clockwise");
	    		  
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    	   }
	       });
	       
	       
	       
	       
	       
	       
	       ContextMenu menu10 = new ContextMenu();
	       MenuItem i101 = new MenuItem("clockwise");
	       MenuItem i102 = new MenuItem("counter_clockwise");
	      
	       menu10.getItems().addAll(i101, i102);
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
	    		   
	    		   
	    		   
	    	   }
	       });
	       i102.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(10, "counter_clockwise");
	    		   
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    		   
	    		   
	    	   }
	       });
	       
	       
	       
	       
	       
	       
	       
	       
	       ContextMenu menu11 = new ContextMenu();
	       MenuItem i111 = new MenuItem("clockwise");
	       MenuItem i112 = new MenuItem("counter_clockwise");
	      
	       menu11.getItems().addAll(i111, i112);
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
	    		   
	    		   
	    		   
	    		   
	    		   
	    	   }
	       });
	       i112.setOnAction(new EventHandler<ActionEvent>() {
	    	   @Override
	    	   public void handle(ActionEvent e) {
	    		   a1.move(11, "counter_clockwise");
	    		  
	    		   
	    		   turn.setText("Player "+ ((a1.turn+1)%2+1)+" turn");
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
	    		   
	    		   
	    		   
	    		   
	    	   }
	       });
	    
	        
	    Group grp5 = new Group(finish, turn, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11, t1, t2);
	    grp5.getChildren().addAll(cell0, cell1, cell2, cell3, cell4, cell5, cell7, cell8, cell9, cell10, cell11, cell6);
	         
	    Scene playScene = new Scene(grp5, 1000, 600);  
	    
	    
	
		Button b6 = new Button("Play");
		Button b1 = new Button("Rule");
		b6.setLayoutX(500);
		b6.setLayoutY(200);
		b1.setLayoutY(300);
		b1.setLayoutX(500);
		Button b5 = new Button("exit");
		b5.setLayoutY(400);
		b5.setLayoutX(500);
		Text text = new Text("O AN QUAN");
		text.setFont(Font.font(40));
		text.setX(400);
		text.setY(100);
	    b6.setOnAction(e -> stage.setScene(playScene));
		Group root = new Group(text, b1, b5, b6);
		Scene scene = new Scene(root, 1000, 600);
		stage.setScene(scene);
		stage.show();
		
		
		// set up rule scene
		
		Text rule = new Text("Mục tiêu cần đạt được để giành chiến thắng: người thắng cuộc trong trò chơi này là người mà khi cuộc chơi kết thúc có tổng số dân quy đổi nhiều hơn."
				+ "\n\n"
				+ "Tùy theo luật chơi từng địa phương hoặc thỏa thuận giữa hai người chơi nhưng phổ biến là 1 quan được quy đổi bằng 10 dân hoặc 5 dân (cờ)."
				+ "\n\n"
				+ "Di chuyển quân: từng người chơi khi đến lượt của mình sẽ di chuyển dân theo phương án để có thể ăn được càng nhiều dân và quan hơn đối phương càng tốt."
				+ "\n\n"
				+ "Người thực hiện lượt đi đầu tiên thường được xác định bằng cách oẳn tù tì hay thỏa thuận."
				+ "\n\n"
				+ "Khi đến lượt, người chơi sẽ dùng tất cả số quân trong một ô có quân bất kỳ do người đó chọn trong số 5 ô vuông thuộc quyền kiểm soát của mình"
				+ "\n"
				+ "để lần lượt rải vào các ô, mỗi ô 1 quân, bắt đầu từ ô gần nhất và có thể rải ngược chiều xuôi chiều kim đồng hồ tùy ý."
				+ "\n\n"
				+ "Khi rải hết quân cuối cùng, tùy tình huống mà người chơi sẽ phải xử lý tiếp như sau:\n"
				+ "\n"
				+ "Nếu liền sau đó là một ô vuông có chứa quân thì tiếp tục dùng tất cả số quân đó để rải tiếp,theo chiều đã chọn.\n"
				+ "\n"
				+ "Nếu liền sau đó là một ô trống (không phân biệt ô quan hay ô dân) rồi đến một ô có chứa quân thì người chơi sẽ bị mất lượt số quân trong ô đó."
				+ "\n"
				+ "Số quân bị ăn sẽ được loại ra khỏi bàn chơi để người chơi tính điểm khi kết thúc."
				+ "\n"
				+ "Nếu liền sau ô có quân đã bị ăn lại là một ô trống rồi đến một ô có quân nữa thì người chơi có quyền ăn tiếp cả quân ở ô này..."
				+ "\nDo đó trong cuộc chơi có thể có phương án rải quân làm cho người chơi ăn hết toàn bộ số quân trên bàn chơi chỉ trong một lượt đi của mình."
				+ "\n Một ô có nhiều dân thường được trẻ em gọi là ô nhà giàu, rất nhiều dân thì gọi là giàu sụ."
				+ "\n Người chơi có thể bằng kinh nghiệm hoặc tính toán phương án nhằm nuôi ô nhà giàu rồi mới ăn để được nhiều điểm.\n"
				+ "Nếu liền sau đó là ô quan có chứa quân hoặc 2 ô trống trở lên hoặc sau khi vừa ăn thì người chơi bị mất lượt và quyền đi tiếp thuộc về đối phương.\n"
				+ "Trường hợp đến lượt đi nhưng cả năm ô vuông thuộc quyền kiểm soát của người chơi đều không có dân thì người đó sẽ phải"
				+ "\n dùng 5 dân đã ăn được của mình để đặt vào mỗi ô 1 dân để có thể thực hiện việc di chuyển quân."
				+ "\n Nếu người chơi không đủ 5 dân thì phải vay của đối phương và trả lại khi tính điểm.\n"
				+ "\n"
				+ "Cuộc chơi sẽ kết thúc khi toàn bộ dân và quan ở hai ô quan đã bị ăn hết."
				+ "\n Trường hợp hai ô quan đã bị ăn hết nhưng vẫn còn dân thì quân trong những hình vuông phía bên nào coi như thuộc về người chơi bên ấy;"
				+ "\n tình huống này được gọi là hết quan, tàn dân, thu quân, kéo về hay hết quan, tàn dân, thu quân, bán ruộng."
				+ "\n Ô quan có ít dân (có số dân nhỏ hơn 5 phổ biến được coi là ít) gọi là quan non và để cuộc chơi không bị kết thúc sớm cho tăng phần thú vị,"
				+ "\n luật chơi có thể quy định không được ăn quan non, nếu rơi vào tình huống đó sẽ bị mất lượt.");
		rule.setX(100);
		rule.setY(100);
		
		Group grp2 = new Group(rule);
		Scene ruleScene = new Scene(grp2, 1000, 600);
		Button b2 = new Button("Return");
		grp2.getChildren().add(b2);
		b2.setOnAction(e -> stage.setScene(scene));
		b1.setOnAction(e -> stage.setScene(ruleScene));
		
		//set up the exitScene 
		
		Button b3 = new Button("Yes");
		Button b4 = new Button("No");
		Text text2 = new Text("Are you sure want to quit");
		Group grp3 = new Group(text2, b3, b4);
		b3.setLayoutY(200);
		b4.setLayoutY(300);
		b3.setLayoutX(500);
		b4.setLayoutX(500);
		Scene exitScene = new Scene(grp3, 1000, 600);
		b3.setOnAction(e -> stage.close());
		b4.setOnAction(e -> stage.setScene(scene));
		b5.setOnAction(e -> stage.setScene(exitScene));
		
		
		
		


	      stage.show();         
	  } 
		
	
	public static void main(String[] args) {
		launch();
	}
}