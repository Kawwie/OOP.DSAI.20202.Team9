
import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;



public class NormalCell {
	
	int pos;
	Rectangle rectangle = new Rectangle(100, 100, Color.FORESTGREEN);
	Text text = new Text("5");
	ArrayList<Stone> num_stone = new ArrayList<Stone>();
	
	
	MenuItem clockwise = new MenuItem("Clockwise");
	MenuItem counter_clockwise = new MenuItem("Counter ClockWise");
	ContextMenu contextmenu = new ContextMenu(clockwise, counter_clockwise);
	
	
	public int countStone() {
		return this.num_stone.size();
	}
	
	
	public NormalCell(double x, double y, int pos) {
		
		
		Stone stone1 = new Stone(x + 50, y + 50);
		Stone stone2 = new Stone(x + 50, y + 50);
		Stone stone3 = new Stone(x + 50, y + 50);
		Stone stone4 = new Stone(x + 50, y + 50);
		Stone stone5 = new Stone(x + 50, y + 50);
		
		num_stone.add(stone1);
		num_stone.add(stone2);
		num_stone.add(stone3);
		num_stone.add(stone4);
		num_stone.add(stone5);
		
		this.pos = pos;
		this.rectangle.setX(x);
		this.rectangle.setY(y);
		
		text.setX(x+20);
		text.setY(y+20);
		
		rectangle.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
			@Override
			public void handle(ContextMenuEvent e) {
				contextmenu.show(rectangle, e.getScreenX(), e.getScreenY());
				
			}
		});
		
	}
}
