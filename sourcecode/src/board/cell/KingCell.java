package board.cell;

import board.stone.Stone;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class KingCell extends Cell {
	
	public Circle circle = new Circle(100, Color.BISQUE);
	public KingCell(double x, double y, int pos) {
		circle.setCenterX(x);
		circle.setCenterY(y);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(2);
		int k = (pos < 6) ? -50 : 50;
		this.locationX = x + k;
		this.locationY = y;
		this.pos = pos;
		Stone stone = new Stone(this.locationX, this.locationY, 10, 20);
		num_stone.add(stone);	
		text.setText("10");
		text.setX(x+(k/2));
		text.setY(y-70);
	}	
}
