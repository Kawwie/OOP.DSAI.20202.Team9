
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;



public class Cell {
	
	int pos;
	Rectangle rectangle = new Rectangle(100, 100, Color.FORESTGREEN);
	Text text = new Text("5");
	MenuItem clockwise = new MenuItem("Clockwise");
	MenuItem counter_clockwise = new MenuItem("Counter ClockWise");
	ContextMenu contextmenu = new ContextMenu(clockwise, counter_clockwise);
	
	
	public Cell(double x, double y, int pos) {
		
		this.pos = pos;
		this.rectangle.setX(x);
		this.rectangle.setY(y);
		
		text.setX(x+50);
		text.setY(y+50);
		
		rectangle.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
			@Override
			public void handle(ContextMenuEvent e) {
				contextmenu.show(rectangle, e.getScreenX(), e.getScreenY());
				
			}
		});
		
	}
}
