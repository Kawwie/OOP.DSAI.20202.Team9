package gui.scene.component;

import board.Board;
import javafx.scene.Group;

public class PlaySceneComponent extends javafx.scene.Group {
    private Group root = new Board().board();
    public PlaySceneComponent() {
    	this.getChildren().addAll(root);
    }
}
