package board.cell;

import board.StoneHolder;
import javafx.scene.text.Text;

public abstract class Cell extends StoneHolder {
	
	public int pos;
	public Text text = new Text("5");
	

	
	public abstract void setLocation(double x, double y);
	
}
