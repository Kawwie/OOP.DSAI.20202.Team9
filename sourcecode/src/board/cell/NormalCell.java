package board.cell;

import java.util.Random;

import board.stone.Stone;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Popup;




public class NormalCell extends Cell{
	
	public Rectangle rectangle = new Rectangle(100, 100, Color.FORESTGREEN);
	public Label left = new Label("<=");
	public Label right = new Label("=>");
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
		
		rectangle.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Popup popup = new Popup();
				popup.setAutoHide(true);
				left.setFont(Font.font(20));
				right.setFont(Font.font(20));
				left.setLayoutX(-20);
				right.setLayoutX(20);
				popup.getContent().addAll(left, right);
				popup.show(rectangle, event.getScreenX()-30, event.getScreenY());
			}
		});
	}

	public void setLocation(double x, double y) {
		this.locationX = x + 50;
		this.locationY = y + 50;
		
	}
	
}
