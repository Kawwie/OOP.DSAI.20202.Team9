package scene;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ExitScene {
	
	public Button yesbtn = new Button("Yes");
	public Button nobtn = new Button("No");
	public Text confirmexit = new Text("Are you sure want to quit");
	Group root = new Group(confirmexit, yesbtn, nobtn);
	
	public Scene exitScene() {
		
		yesbtn.setLayoutY(200);
		nobtn.setLayoutY(300);
		yesbtn.setLayoutX(500);
		nobtn.setLayoutX(500);
		Scene exitScene = new Scene(root, 1000, 600, Color.WHEAT);
		
		return exitScene;
	}

}
