package board;
import java.util.ArrayList;
import javafx.scene.text.Text;

public class Cell {
	
	public int pos;
	public ArrayList<Stone> num_stone = new ArrayList<Stone>();
	public Text text = new Text("5");
	
	public double locationX;
	public double locationY;

}
