package board.cell;
import java.util.Random;

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
		
		for(int i=0;i<10;i++) {
			Random rand = new Random();
			Stone stone = new Stone( x- 20 + k + rand.nextInt(40), y - 20 + rand.nextInt(40));
			num_stone.add(stone);
		}	
		text.setText("10");
		text.setX(x+(k/2));
		text.setY(y-70);
		
	}
	
	public KingCell(int pos) {
		this.pos = pos;
	}
	
	public KingCell(Color color) {
		circle.setFill(color);
	}
	
	
	
	
	
	public void setLocation(double x, double y) {
		int k = (this.pos < 6) ? -50 : 50;
		this.locationX = x + k;
		this.locationY = y;
		
		
	}
}
