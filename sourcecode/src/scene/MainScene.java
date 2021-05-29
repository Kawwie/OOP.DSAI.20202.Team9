package scene;


import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MainScene {
	
	public Button playbtn = new Button("Play");
	public Button rulebtn = new Button("Rule");
	public Button exitbtn = new Button("Exit");
	private Text text = new Text(300, 100, "O AN QUAN");
	private Group root = new Group(text, rulebtn, exitbtn, playbtn);
	private Scene mainScene;
	
	public Scene mainScene() {
		
		
		text.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 80));
		
		
		playbtn.setPrefSize(100, 30);
		rulebtn.setPrefSize(100, 30);
		exitbtn.setPrefSize(100, 30);
		
		playbtn.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		rulebtn.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		exitbtn.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
	
	
		playbtn.setLayoutX(475);
		playbtn.setLayoutY(200);
		rulebtn.setLayoutY(300);
		rulebtn.setLayoutX(475);
		exitbtn.setLayoutY(400);
		exitbtn.setLayoutX(475);
		
		mainScene = new Scene(root, 1000, 600, Color.WHEAT);
		
		
		
		
		return mainScene;
		
		
		
	}

}
