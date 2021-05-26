package scene;

import board.Board;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class PlayScene  {
	Board board = new Board();
    public Scene playScene() {
       Group root = board.board();
	   Scene scene = new Scene(root, 1000, 800, Color.ALICEBLUE);
	   return scene;
    }	       
}
