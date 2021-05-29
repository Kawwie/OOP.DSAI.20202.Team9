package board;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Random;

public class Stone extends Circle {
	
	
	
	public Stone(double centerX, double centerY) {
		
		
		Random rand = new Random();
		this.setCenterX(centerX);
		this.setCenterY(centerY);
		this.setRadius(10);
		this.setFill(Color.rgb(rand.nextInt(226), rand.nextInt(226), rand.nextInt(226)));
	}
	
	
	public Stone(double centerX, double centerY, Color color) {
		this.setCenterX(centerX);
		this.setCenterY(centerY);
		this.setFill(color);
		
	}
	
}
