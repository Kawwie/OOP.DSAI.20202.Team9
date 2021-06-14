package board.cell;

import java.util.Random;

import actionListener.ContextMenuListener;
import board.stone.*;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;




public class NormalCell extends Cell{
	
	public Rectangle rectangle = new Rectangle(100, 100, Color.FORESTGREEN);
	public MenuItem clockwise = new MenuItem("Clockwise");
	public MenuItem counter_clockwise = new MenuItem("Counter ClockWise");
	public javafx.scene.control.ContextMenu contextmenu = new javafx.scene.control.ContextMenu(clockwise, counter_clockwise);
	public ContextMenuListener contextMenuListener = new ContextMenuListener(rectangle, contextmenu);


	public NormalCell(double x, double y, int pos) {
		
		rectangle.setStroke(Color.BLACK);
		rectangle.setStrokeWidth(2);
		
		this.locationX = x + 50;
		this.locationY = y + 50;
		
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
		
		rectangle.setOnContextMenuRequested(contextMenuListener);
		
	}

	public void setLocation(double x, double y) {
		this.locationX = x + 50;
		this.locationY = y + 50;

	}
	
}
