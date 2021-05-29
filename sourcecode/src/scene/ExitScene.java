package scene;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ExitScene {
	
	public Button yesbtn = new Button("Yes");
	public Button nobtn = new Button("No");
	private Text confirmexit = new Text("Are you sure want to quit");
	private Group root = new Group(confirmexit, yesbtn, nobtn);
	private Scene exitScene;
	
	public Scene exitScene() {
		
		yesbtn.setLayoutY(200);
		nobtn.setLayoutY(300);
		yesbtn.setLayoutX(500);
		nobtn.setLayoutX(500);
		exitScene = new Scene(root, 1000, 600, Color.WHEAT);
		
		return exitScene;
	}

}
