package board;

import java.util.Random;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;




public class NormalCell extends Cell{
	
	public Rectangle rectangle = new Rectangle(100, 100, Color.FORESTGREEN);
	public MenuItem clockwise = new MenuItem("Clockwise");
	public MenuItem counter_clockwise = new MenuItem("Counter ClockWise");
	public ContextMenu contextmenu = new ContextMenu(clockwise, counter_clockwise);
	
	
	public NormalCell(double x, double y, int pos) {
		
		rectangle.setStroke(Color.BLACK);
		rectangle.setStrokeWidth(2);
		
		this.locationx = x + 50;
		this.locationy = y + 50;
		
		for(int i=0;i<5;i++) {
			Random rand = new Random();
			Stone stone = new Stone(x + rand.nextInt(50) + 30, y + rand.nextInt(50) + 30);
			num_stone.add(stone);
		}
		
		
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
