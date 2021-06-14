package scene;

import board.Board;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class PlayScene  {
	private Board board = new Board();
	private Scene playScene;
    public Scene playScene() {
       Group root = board.board();
	   playScene = new Scene(root, 1000, 600, Color.ALICEBLUE);
	   return playScene;
    }	       
}
