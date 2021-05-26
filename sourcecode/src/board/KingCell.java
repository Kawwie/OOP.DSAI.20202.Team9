package board;
import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class KingCell extends Cell {
	
	Circle circle = new Circle(100, Color.BISQUE);
	
	public KingCell(double x, double y, int pos) {
		circle.setCenterX(x);
		circle.setCenterY(y);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(2);
		int k = (pos < 6) ? -50 : 50;
		this.locationx = x + k;
		this.locationy = y;
		this.pos = pos;
		
		for(int i=0;i<10;i++) {
			Random rand = new Random();
			Stone stone = new Stone( x- 20 + k + rand.nextInt(40), y - 20 + rand.nextInt(40));
			num_stone.add(stone);
		}	
		
	}
}
