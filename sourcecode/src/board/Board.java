package board;

import board.player.Player;
import board.stone.Stone;
import javafx.animation.PathTransition;
import javafx.animation.SequentialTransition;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
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
	
	SequentialTransition sequentialTransition;
	
	
	boolean direction;
	

	
	
	private int turn = 0;
	
	private int pointer;
	
	//set up turn
	private Text playerTurn = new Text(100, 100, "PLayer 1 turn");
	
	
	//finish text
	private Text result = new Text(300, 550, "");
	
	//set up player
	private Player player2 = new Player(750, 50, "Player 2 score: ");
	private Player player1 = new Player(50, 450, "Player 1 score: ");
	
	
	
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
       
       
       
       NormalCell[] normalcell = { c1, c2, c3, c4, c5, c7, c8, c9, c10, c11};
       KingCell[] kingcell = { c0, c6 };
       Player[] player = { player1, player2 };
       
       for (Player i : player) {
    	   root.getChildren().addAll(i.cellPlace, i.text);
       }
       for (KingCell i : kingcell) {
    	   root.getChildren().addAll(i.circle, i.text);
       }
       for (NormalCell i : normalcell) {
    	   setActionListener(i);
    	   root.getChildren().addAll(i.rectangle, i.text);
       }
       
       for (Cell i : board) {
    	   root.getChildren().addAll(i.num_stone);
       }

       
       
 	   root.getChildren().addAll(playerTurn, result);
 	   
 	   
 	   return root;
 	   
    }
    
    public PathTransition stoneMove(Stone stone, StoneHolder stoneHolder) {
    	Path path = new Path();
    	path.getElements().add(new MoveTo(stone.getCenterX(), stone.getCenterY()));
    	Random rand = new Random();
	    double x = stoneHolder.locationX + rand.nextInt(20) - 10;
		double y = stoneHolder.locationY + rand.nextInt(20) - 10;
		path.getElements().add(new LineTo(x, y));
		PathTransition pathTransition = new PathTransition();  
		pathTransition.setDuration(Duration.millis(500));  
		pathTransition.setNode(stone);  
		pathTransition.setPath(path);
		stone.setCenterX(x);
		stone.setCenterY(y);
		stoneHolder.num_stone.add(stone);
		return pathTransition;
    }
    
    public void move(NormalCell cell) {
    	
    	int k = (direction) ? 1 : -1;
    	
    	
    	pointer = cell.pos%12 + 12;
    	int numberOfStone = cell.num_stone.size();
    	for(int i=0;i<numberOfStone;i++) {
			   pointer +=k;
			   Stone stone = cell.num_stone.get(0);
			   cell.num_stone.remove(0); 
			   sequentialTransition.getChildren().add(stoneMove(stone, board[pointer%12]));
	   }
    	
    	//check if can pick again
    	
    	if(!((pointer+k)%12 == 0 || (pointer+k)%12 ==6)) {
    		if (board[(pointer+k)%12].num_stone.size() != 0) {
    			move(((NormalCell) board[(pointer+k)%12]));
    		}
    	}
    	
        if(board[(pointer+k)%12].num_stone.size() == 0 && board[(pointer+k*2)%12].num_stone.size() != 0) {
            takeStone(board[(pointer+k*2)%12]);
            board[(pointer+k*2)%12].num_stone.clear();
            if(board[(pointer+k*3)%12].num_stone.size() == 0 && board[(pointer+k*4)%12].num_stone.size() != 0) {
                takeStone(board[(pointer+k*4)%12]);
                board[(pointer+k*4)%12].num_stone.clear();
                if(board[(pointer+k*5)%12].num_stone.size() == 0 && board[(pointer+k*6)%12].num_stone.size() != 0) {
                    takeStone(board[(pointer+k*6)%12]);
                    board[(pointer+k*6)%12].num_stone.clear();
                    if(board[(pointer+k*7)%12].num_stone.size() == 0 && board[(pointer+k*8)%12].num_stone.size() != 0) {
                        takeStone(board[(pointer+k*8)%12]);
                        board[(pointer+k*8)%12].num_stone.clear(); 
                        if(board[(pointer+k*9)%12].num_stone.size() == 0 && board[(pointer+k*8)%10].num_stone.size() != 0) {
                            takeStone(board[(pointer+k*10)%12]);
                            board[(pointer+k*10)%12].num_stone.clear();
                            if(board[(pointer+k*11)%12].num_stone.size() == 0) {
                                takeStone(board[pointer]);
                                board[pointer].num_stone.clear();
                            }
                        }
                    }
                }
            }
        }

    }
	
	 // setactionlistener function
    private void setActionListener(NormalCell normalcell) {
    	
    	normalcell.left.setOnMouseClicked(new EventHandler<MouseEvent>() {
    		public void handle(MouseEvent e) {
    			if(normalcell.pos < 6) {
    				direction = false;}
    			else {
    				direction = true;
    			}
    			
    			sequentialTransition = new SequentialTransition();
    			move(normalcell);
    			
    			if (checkWinning()) {
    				for (int i=7;i<=11;i++) {
    					for(Stone stone : board[i].num_stone) {
			 			   sequentialTransition.getChildren().add(stoneMove(stone, player1));
    			    	}
    				}
    				for (int i=1;i<=5;i++) {
    					for(Stone stone : board[i].num_stone) {
    						sequentialTransition.getChildren().add(stoneMove(stone, player2));
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
    			returnStone(sequentialTransition);
    			
    	        sequentialTransition.play();
    	    	printBoard();
    		}
    	});
    	
    	
    	normalcell.right.setOnMouseClicked(new EventHandler<MouseEvent>() {
    		public void handle(MouseEvent e) {
    			if(normalcell.pos < 6) {
    				direction = true;}
    			else {
    				direction = false;
    			}
    			sequentialTransition = new SequentialTransition();
    			move(normalcell);
    			
    			if (checkWinning()) {
    				for (int i=7;i<=11;i++) {
    					for(Stone stone : board[i].num_stone) { 
    			 			   sequentialTransition.getChildren().add(stoneMove(stone, player1));
    			    	}
    				}
    				for (int i=1;i<=5;i++) {
    					for(Stone stone : board[i].num_stone) { 
    			 			   sequentialTransition.getChildren().add(stoneMove(stone, player2));
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

    			returnStone(sequentialTransition);
    	        sequentialTransition.play();
    	    	printBoard();
    			
    		}
    	});
    }
    	
    private void takeStone(Cell cell) {
    	if (turn%2 == 0) {
    		for(Stone stone : cell.num_stone) { 
 			   sequentialTransition.getChildren().add(stoneMove(stone, player1));
    		}
    	}
    	else {
    		for(Stone stone : cell.num_stone) {
  			   sequentialTransition.getChildren().add(stoneMove(stone, player2));
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
	    			result.setText("Player 2 win!");
	    		}
	    		else {
	    			for(int i=7;i<=11;i++) {
	    				Stone stone = player1.num_stone.get(0);
	    				player1.num_stone.remove(0);
	    	  			sequentialtransition.getChildren().add(stoneMove(stone, board[i]));
	    			}
	    		}
    		}
    	}
    	else {
    		if(board[1].num_stone.size() + board[2].num_stone.size() + board[3].num_stone.size() + board[4].num_stone.size() + board[5].num_stone.size() == 0) {
	    		if(player2.num_stone.size() < 5) {
	    			result.setText("Player 1 win!");
	    		}
	    		else {
	    			for(int i=1;i<=5;i++) {
	    				Stone stone = player2.num_stone.get(0);
	    				player2.num_stone.remove(0);
	    	  			sequentialtransition.getChildren().add(stoneMove(stone, board[i]));
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
