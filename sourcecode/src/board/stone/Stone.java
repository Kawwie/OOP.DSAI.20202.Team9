package board.stone;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Random;

public class Stone extends Circle {
	
	public int value;
	
	public Stone(double centerX, double centerY, int value, double radius) {
		
		Random rand = new Random();
		this.setCenterX(centerX);
		this.setCenterY(centerY);
		this.setRadius(radius);
		this.setFill(Color.rgb(rand.nextInt(226), rand.nextInt(226), rand.nextInt(226)));
		this.value = value;
	}
}
