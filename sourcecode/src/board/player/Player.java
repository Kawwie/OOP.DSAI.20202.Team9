package board.player;

import java.util.ArrayList;

import board.stone.Stone;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Player {

	
	
	public Text text = new Text("Player score:");
	public Rectangle cellPlace = new Rectangle(125, 125, Color.BURLYWOOD);
	public ArrayList<Stone> num_stone = new ArrayList<Stone>();
	public Player(double x, double y) {
		

		text.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 15));
		this.cellPlace.setX(x);
		this.cellPlace.setY(y);
		cellPlace.setStrokeWidth(2);
		cellPlace.setStroke(Color.BLACK);
		text.setX(x);
		text.setY(y-20);

	}
	
	public Player(double x, double y, Font z) {
		this.text.setFont(z);
		this.cellPlace.setX(x);
		this.cellPlace.setY(y);
		cellPlace.setStrokeWidth(2);
		cellPlace.setStroke(Color.BLACK);
		text.setX(x);
		text.setY(y-20);

	}
	
	public Player(double x, double y, String input_text) {
		
		text.setText(input_text);

		text.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 15));
		this.cellPlace.setX(x);
		this.cellPlace.setY(y);
		cellPlace.setStrokeWidth(2);
		cellPlace.setStroke(Color.BLACK);
		text.setX(x);
		text.setY(y-20);

	}
	
	
}
