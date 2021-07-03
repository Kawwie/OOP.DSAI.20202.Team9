package board.player;

import board.StoneHolder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Player extends StoneHolder {
	
	public Text text;
	public Rectangle cellPlace = new Rectangle(125, 125, Color.BURLYWOOD);
	public Player(double x, double y, String input) {
		
		text = new Text(input);
		text.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 15));
		this.cellPlace.setX(x);
		this.cellPlace.setY(y);
		cellPlace.setStrokeWidth(2);
		cellPlace.setStroke(Color.BLACK);
		text.setX(x);
		text.setY(y-20);
		this.locationX = x + 50;
		this.locationY = y + 50;

	}

}
