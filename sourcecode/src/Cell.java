
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;

public class Cell {
	
	Rectangle rectangle = new Rectangle(100, 100, Color.FORESTGREEN);
	ArrayList<Stone> cell;
	
	public Cell(double x, double y) {
		this.rectangle.setX(x);
		this.rectangle.setY(y);
		Stone stone1 = new Stone(x + 10, y+ 10);
		Stone stone2 = new Stone(x + 20, y+ 20);
		Stone stone3 = new Stone(x + 30, y+ 30);
		Stone stone4 = new Stone(x + 40, y+ 40);
		Stone stone5 = new Stone(x + 50, y+ 50);
		cell.add(stone1);
		cell.add(stone2);
		cell.add(stone3);
		cell.add(stone4);
		cell.add(stone5);
	}
}
