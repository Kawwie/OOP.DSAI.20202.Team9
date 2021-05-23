import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MainScene {
	
	Button playbtn = new Button("Play");
	Button rulebtn = new Button("Rule");
	Button exitbtn = new Button("Exit");
	Text text = new Text(400, 100, "O AN QUAN");
	Group root = new Group(text, rulebtn, exitbtn, playbtn);
	
	public Scene mainScene() {
		
		
		text.setFont(Font.font(40));
		
		playbtn.setLayoutX(500);
		playbtn.setLayoutY(200);
		rulebtn.setLayoutY(300);
		rulebtn.setLayoutX(500);
		exitbtn.setLayoutY(400);
		exitbtn.setLayoutX(500);
		
		Scene mainScene = new Scene(root, 1000, 600, Color.WHEAT);
		
		return mainScene;
	}

}
