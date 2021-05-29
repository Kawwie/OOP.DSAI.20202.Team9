package board;

import board.player.Player;
import board.stone.Stone;
import javafx.animation.PathTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.Random;

import board.cell.Cell;
import board.cell.KingCell;
import board.cell.NormalCell;

public class Board {
	
	
	private int turn = 0;
	
	private int pointer;
	
	//set up turn
	private Text playerTurn = new Text(100, 100, "PLayer 1 turn");
	
	
	//finish text
	private Text result = new Text(300, 550, "");
	
	//set up player
	private Player player2 = new Player(750, 50);
	private Player player1 = new Player(50, 450);
	
	
	
	//setting up the board cell
	private KingCell c0 = new KingCell(225, 300, 0);
	private NormalCell c1 = new NormalCell(225, 200, 1);
    private NormalCell c2 = new NormalCell(325, 200, 2);
    private NormalCell c3 = new NormalCell(425, 200, 3);
    private NormalCell c4 = new NormalCell(525, 200, 4);
    private NormalCell c5 = new NormalCell(625, 200, 5);
    private KingCell c6 = new KingCell(725, 300, 6);
    private NormalCell c11 = new NormalCell(225, 300, 11);
    private NormalCell c10 = new NormalCell(325, 300, 10);
    private NormalCell c9 = new NormalCell(425, 300, 9);
    private NormalCell c8 = new NormalCell(525, 300, 8);
    private NormalCell c7 = new NormalCell(625, 300, 7);
    
    
    //setting up the board
    private Cell[] board = {c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11};
    
    private Group root = new Group();
    
    
    public Group board() {
    	
  
       result.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 80));
       playerTurn.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 30));
    	
       root.getChildren().addAll(c0.circle, c0.text);
       root.getChildren().addAll(c6.circle, c6.text);
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
 	   root.getChildren().addAll(player1.cellPlace, player2.cellPlace);
 	   
 	   //add player turn
 	   root.getChildren().add(playerTurn);
 	   root.getChildren().add(result);
 	   
 	   
 	   //add player text
 	   root.getChildren().addAll(player1.text, player2.text);
 	   
 	   
 	   //add stone to the board
 	   for(Cell i : board) {
 		   root.getChildren().addAll(i.num_stone);
 	   }
 	   

 	   
 	   //add actionlistener to the board
 	   for (int i=0;i<12;i++) {
 		   if(!( i==0 || i ==6)) {
 			   setActionListener((NormalCell)board[i]);
 		   }
 	   }
 	   return root;
 	   
    }	
	
	 // setactionlistener function
    private void setActionListener(NormalCell normalcell) {
    	
    	normalcell.clockwise.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			SequentialTransition sequentialtransition = new SequentialTransition();
    			moveclockwise(normalcell, sequentialtransition);
    			
    			if (checkWinning()) {
    				for (int i=7;i<=11;i++) {
    					for(Stone stone : board[i].num_stone) {
    			    		   Path path = new Path();
    			 			   path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
    			 			   Random rand = new Random();
    			 			   double x = player1.cellPlace.getX() + rand.nextInt(50) + 30;
    			 			   double y = player1.cellPlace.getY() + rand.nextInt(50) + 30;
    			 			   path.getElements().add(new LineTo(x, y));
    			 			   PathTransition pathTransition = new PathTransition();  
    			 			   pathTransition.setDuration(Duration.millis(500));  
    			 			   pathTransition.setNode(stone);  
    			 			   pathTransition.setPath(path);  
    			 			   sequentialtransition.getChildren().add(pathTransition);
    			 			   stone.setCenterX(x);
    						   stone.setCenterY(y);
    			 			   player1.num_stone.add(stone);
    			    	}
    				}
    				for (int i=1;i<=5;i++) {
    					for(Stone stone : board[i].num_stone) {
    			    		   Path path = new Path();
    			 			   path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
    			 			   Random rand = new Random();
    			 			   double x = player2.cellPlace.getX() + rand.nextInt(50) + 30;
    			 			   double y = player2.cellPlace.getY() + rand.nextInt(50) + 30;
    			 			   path.getElements().add(new LineTo(x, y));
    			 			   PathTransition pathTransition = new PathTransition();  
    			 			   pathTransition.setDuration(Duration.millis(500));  
    			 			   pathTransition.setNode(stone);  
    			 			   pathTransition.setPath(path);  
    			 			   sequentialtransition.getChildren().add(pathTransition);
    			 			   stone.setCenterX(x);
    						   stone.setCenterY(y);
    			 			   player2.num_stone.add(stone);
    			    	}
    				}
    				
    				if (player1.num_stone.size() < player2.num_stone.size()) {
    					result.setText("Player 2 win !");
    					
    				}
    				else if (player1.num_stone.size() > player2.num_stone.size()) {
    					result.setText("Player 1 win !");
    				}
    				else {
    					result.setText("Draw !");
    				}
    			}
    			turn +=1;
    			playerTurn.setText("Player " + (turn%2+1) + " turn");
    			returnStone(sequentialtransition);
    			
    	        sequentialtransition.play();
    	    	printBoard();
    		}
    	});
    	
    	
    	normalcell.counter_clockwise.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			SequentialTransition sequentialtransition = new SequentialTransition();
    			countermoveclockwise(normalcell, sequentialtransition);
    			
    			if (checkWinning()) {
    				for (int i=7;i<=11;i++) {
    					for(Stone stone : board[i].num_stone) {
    			    		   Path path = new Path();
    			 			   path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
    			 			   Random rand = new Random();
    			 			   double x = player1.cellPlace.getX() + rand.nextInt(50) + 30;
    			 			   double y = player1.cellPlace.getY() + rand.nextInt(50) + 30;
    			 			   path.getElements().add(new LineTo(x, y));
    			 			   PathTransition pathTransition = new PathTransition();  
    			 			   pathTransition.setDuration(Duration.millis(500));  
    			 			   pathTransition.setNode(stone);  
    			 			   pathTransition.setPath(path);  
    			 			   sequentialtransition.getChildren().add(pathTransition);
    			 			   stone.setCenterX(x);
    						   stone.setCenterY(y);
    			 			   player1.num_stone.add(stone);
    			    	}
    				}
    				for (int i=1;i<=5;i++) {
    					for(Stone stone : board[i].num_stone) {
    			    		   Path path = new Path();
    			 			   path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
    			 			   Random rand = new Random();
    			 			   double x = player2.cellPlace.getX() + rand.nextInt(50) + 30;
   			 			       double y = player2.cellPlace.getY() + rand.nextInt(50) + 30;
   			 			       path.getElements().add(new LineTo(x, y));
    			 			   PathTransition pathTransition = new PathTransition();  
    			 			   pathTransition.setDuration(Duration.millis(500));  
    			 			   pathTransition.setNode(stone);  
    			 			   pathTransition.setPath(path);  
    			 			   sequentialtransition.getChildren().add(pathTransition);
    			 			   stone.setCenterX(x);
    						   stone.setCenterY(y);
    			 			   player2.num_stone.add(stone);
    			    	}
    				}
    				
    				if (player1.num_stone.size() < player2.num_stone.size()) {
    					result.setText("Player 2 win !");
    					
    				}
    				else if (player1.num_stone.size() > player2.num_stone.size()) {
    					result.setText("Player 1 win !");
    				}
    				else {
    					result.setText("Draw !");
    				}
    			}
    			
    			turn +=1;
    			playerTurn.setText("Player " + (turn%2+1) + " turn");

    			returnStone(sequentialtransition);
    	        sequentialtransition.play();
    	    	printBoard();
    			
    		}
    	});
    }
    
    // move function
    private void moveclockwise(NormalCell cell, SequentialTransition sequentialtransition) {
    	pointer = cell.pos%12 + 12;
    	int rocks = cell.num_stone.size();
    	for(int i=0;i< rocks;i++) {
			   pointer +=1;
			   Stone stone = cell.num_stone.get(0);
			   cell.num_stone.remove(0);
			   Path path = new Path();
			   path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
			   Random rand = new Random();
			   double x = board[pointer%12].locationX + rand.nextInt(20) - 10;
			   double y = board[pointer%12].locationY + rand.nextInt(20) - 10;
			   path.getElements().add(new LineTo(x, y));
			   PathTransition pathTransition = new PathTransition();  
			   pathTransition.setDuration(Duration.millis(500));  
			   pathTransition.setNode(stone);  
			   pathTransition.setPath(path);  
			   sequentialtransition.getChildren().add(pathTransition);
			   stone.setCenterX(x);
			   stone.setCenterY(y);
			   board[pointer%12].num_stone.add(stone);
			   
	   }
    	
    	//check if can pick again
    	
    	if(!((pointer+1)%12 == 0 || (pointer+1)%12 ==6)) {
    		if (board[(pointer+1)%12].num_stone.size() != 0) {
    			moveclockwise(((NormalCell) board[(pointer+1)%12]), sequentialtransition);
    		}
    	}
    	
        if(board[(pointer+1)%12].num_stone.size() == 0 && board[(pointer+1*2)%12].num_stone.size() != 0) {
            takeStone(board[(pointer+1*2)%12], sequentialtransition);
            board[(pointer+1*2)%12].num_stone.clear();
            if(board[(pointer+1*3)%12].num_stone.size() == 0 && board[(pointer+1*4)%12].num_stone.size() != 0) {
                takeStone(board[(pointer+1*4)%12], sequentialtransition);
                board[(pointer+1*4)%12].num_stone.clear();
                if(board[(pointer+1*5)%12].num_stone.size() == 0 && board[(pointer+1*6)%12].num_stone.size() != 0) {
                    takeStone(board[(pointer+1*6)%12], sequentialtransition);
                    board[(pointer+1*6)%12].num_stone.clear();
                    if(board[(pointer+1*7)%12].num_stone.size() == 0 && board[(pointer+1*8)%12].num_stone.size() != 0) {
                        takeStone(board[(pointer+1*8)%12], sequentialtransition);
                        board[(pointer+1*8)%12].num_stone.clear(); 
                        if(board[(pointer+1*9)%12].num_stone.size() == 0 && board[(pointer+1*8)%10].num_stone.size() != 0) {
                            takeStone(board[(pointer+1*10)%12], sequentialtransition);
                            board[(pointer+1*10)%12].num_stone.clear();
                            if(board[(pointer+1*11)%12].num_stone.size() == 0) {
                                takeStone(board[pointer], sequentialtransition);
                                board[pointer].num_stone.clear();
                            }
                        }
                    }
                }
            }
        }
    	



    }
    
    private void countermoveclockwise(NormalCell cell, SequentialTransition sequentialtransition) {
    	pointer = cell.pos%12 + 12;
    	int rocks = cell.num_stone.size();    	
    	for(int i=0;i< rocks;i++) {
		   
		   pointer -=1;
		   Path path = new Path();
		   Stone stone = cell.num_stone.get(0);
		   cell.num_stone.remove(0);
		   path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
		   Random rand = new Random();
		   double x = board[pointer%12].locationX + rand.nextInt(20) - 10;
		   double y = board[pointer%12].locationY + rand.nextInt(20) - 10;
		   path.getElements().add(new LineTo(x, y));
		   PathTransition pathTransition = new PathTransition();  
		   pathTransition.setDuration(Duration.millis(500));  
		   pathTransition.setNode(stone);  
		   pathTransition.setPath(path);  
		   sequentialtransition.getChildren().add(pathTransition);
		   stone.setCenterX(x);
		   stone.setCenterY(y);
		   board[pointer%12].num_stone.add(stone);
	    }
    	//check if can pick again
    	if(!(((pointer-1)%12 == 0)|| (pointer-1)%12==6)) {
    		if (board[(pointer-1)%12].num_stone.size() != 0) {
    			countermoveclockwise(((NormalCell) board[(pointer-1)%12]), sequentialtransition);
    		}
    		
    	}
    	
    	
    	if(board[(pointer-1)%12].num_stone.size() == 0 && board[(pointer-1*2)%12].num_stone.size() != 0) {
            takeStone(board[(pointer-1*2)%12], sequentialtransition);
            board[(pointer-1*2)%12].num_stone.clear();
            if(board[(pointer-1*3)%12].num_stone.size() == 0 && board[(pointer-1*4)%12].num_stone.size() != 0) {
                takeStone(board[(pointer-1*4)%12], sequentialtransition);
                board[(pointer-1*4)%12].num_stone.clear();
                if(board[(pointer-1*5)%12].num_stone.size() == 0 && board[(pointer-1*6)%12].num_stone.size() != 0) {
                    takeStone(board[(pointer-1*6)%12], sequentialtransition);
                    board[(pointer-1*6)%12].num_stone.clear();
                    if(board[(pointer-1*7)%12].num_stone.size() == 0 && board[(pointer-1*8)%12].num_stone.size() != 0) {
                        takeStone(board[(pointer-1*8)%12], sequentialtransition);
                        board[(pointer-1*8)%12].num_stone.clear(); 
                        if(board[(pointer-1*9)%12].num_stone.size() == 0 && board[(pointer-1*8)%10].num_stone.size() != 0) {
                            takeStone(board[(pointer-1*10)%12], sequentialtransition);
                            board[(pointer-1*10)%12].num_stone.clear();
                            if(board[(pointer-1*11)%12].num_stone.size() == 0) {
                                takeStone(board[pointer], sequentialtransition);
                                board[pointer].num_stone.clear();
                            }
                        }
                    }
                }
            }
        }
    	
    }
    	
    	
    private void takeStone(Cell cell, SequentialTransition sequentialtransition) {
    	if (turn%2 == 0) {
    		for(Stone stone : cell.num_stone) {
    		   Path path = new Path();
 			   path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
 			   Random rand = new Random();
 			   double x = player1.cellPlace.getX() + rand.nextInt(50) + 30;
 			   double y = player1.cellPlace.getY() + rand.nextInt(50) + 30;
 			   path.getElements().add(new LineTo(x, y));
 			   PathTransition pathTransition = new PathTransition();  
 			   pathTransition.setDuration(Duration.millis(500));  
 			   pathTransition.setNode(stone);  
 			   pathTransition.setPath(path);  
 			   sequentialtransition.getChildren().add(pathTransition);
 			   stone.setCenterX(x);
			   stone.setCenterY(y);
 			   player1.num_stone.add(stone);
    			
    		}
    		
    	}
    	else {
    		for(Stone stone : cell.num_stone) {
     		   Path path = new Path();
  			   path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
  			   Random rand = new Random();
  			   double x = player2.cellPlace.getX() + rand.nextInt(50) + 30;
  			   double y = player2.cellPlace.getY() + rand.nextInt(50) + 30;
  			   path.getElements().add(new LineTo(x, y));
  			   PathTransition pathTransition = new PathTransition();  
  			   pathTransition.setDuration(Duration.millis(500));  
  			   pathTransition.setNode(stone);  
  			   pathTransition.setPath(path);  
  			   sequentialtransition.getChildren().add(pathTransition);
 			   stone.setCenterX(x);
			   stone.setCenterY(y);
  			   player2.num_stone.add(stone);
    		}
    	}
    }
    
    private boolean checkWinning() {
    	if (c0.num_stone.size() + c6.num_stone.size() == 0) {
    		return true;
    	}
    	return false;
    }
    
     
    //return stone to  cell if there is no cell on the turn
    private void returnStone(SequentialTransition sequentialtransition) {
    	if(turn%2==0) {	
    		if(board[7].num_stone.size() + board[8].num_stone.size() + board[9].num_stone.size() + board[10].num_stone.size() + board[11].num_stone.size() == 0) {
	    		if(player1.num_stone.size() < 5) {
	    			System.out.println("Player 2 win");
	    		}
	    		else {
	    			for(int i=7;i<=11;i++) {
	    				Stone stone = player1.num_stone.get(0);
	    				player1.num_stone.remove(0);
	    				Path path = new Path();
	    	  			path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
	    	  			Random rand = new Random();
	    	  			double x = board[i].locationX + rand.nextInt(20) - 10;
	    	  			double y = board[i].locationY + rand.nextInt(20) - 10;
	    	  			path.getElements().add(new LineTo(x, y));
	    	  			PathTransition pathTransition = new PathTransition();  
	    	  			pathTransition.setDuration(Duration.millis(500));  
	    	  			pathTransition.setNode(stone);  
	    	  			pathTransition.setPath(path);  
	    	  			sequentialtransition.getChildren().add(pathTransition);
	    	  			stone.setCenterX(x);
	    	  			stone.setCenterY(y);
	    	  			board[i].num_stone.add(stone);
	    			}
	    		}
    		}
    	}
    	else {
    		if(board[1].num_stone.size() + board[2].num_stone.size() + board[3].num_stone.size() + board[4].num_stone.size() + board[5].num_stone.size() == 0) {
	    		if(player2.num_stone.size() < 5) {
	    			System.out.println("Player 1 win");
	    		}
	    		else {
	    			for(int i=1;i<=5;i++) {
	    				Stone stone = player2.num_stone.get(0);
	    				player2.num_stone.remove(0);
	    				Path path = new Path();
	    	  			path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
	    	  			Random rand = new Random();
	    	  			double x = board[i].locationX + rand.nextInt(20) - 10;
	    	  			double y = board[i].locationY + rand.nextInt(20) - 10;
	    	  			path.getElements().add(new LineTo(x, y));
	    	  			PathTransition pathTransition = new PathTransition();  
	    	  			pathTransition.setDuration(Duration.millis(500));  
	    	  			pathTransition.setNode(stone);  
	    	  			pathTransition.setPath(path);  
	    	  			sequentialtransition.getChildren().add(pathTransition);
	    	  			stone.setCenterX(x);
	    	  			stone.setCenterY(y);
	    	  			board[i].num_stone.add(stone);
	    			
	    			}
	    		}  
	    	}
    	}
    }
    
    
    //for printing number of stones
	private void printBoard() {
		for (Cell cell : board) {
			cell.text.setText("" + cell.num_stone.size());
		}
		player1.text.setText("player 1 score: " + player1.num_stone.size());
		player2.text.setText("player 2 score: " + player2.num_stone.size());
	}

}
