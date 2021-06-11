package scene;

import board.Board;
import javafx.scene.Group;

public class PlayScene extends javafx.scene.Group {
    Group root = new Board().board();
    public PlayScene() {
    	this.getChildren().addAll(root);
    }
}
