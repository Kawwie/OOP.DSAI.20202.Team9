package board;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Stone extends Circle {
	
	
	
	public Stone(double centerX, double centerY) {
		
		
		
		this.setCenterX(centerX);
		this.setCenterY(centerY);
		this.setRadius(10);
		this.setFill(Color.AQUAMARINE);
	}
	
}
