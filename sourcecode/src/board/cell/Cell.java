package board.cell;
import java.util.ArrayList;

import board.StoneHolder;
import board.stone.Stone;
import javafx.scene.text.Text;

public abstract class Cell extends StoneHolder {
	
	public int pos;
	public ArrayList<Stone> num_stone = new ArrayList<Stone>();
	public Text text = new Text("5");
	

	
	public abstract void setLocation(double x, double y);
	
}
