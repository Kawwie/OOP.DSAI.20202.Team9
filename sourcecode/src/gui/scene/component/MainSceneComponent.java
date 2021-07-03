	package gui.scene.component;


import gui.button.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MainSceneComponent extends javafx.scene.Group{
	public Button playbtn = new Button("Play");
	public Button rulebtn = new Button("Rule");
	public Button exitbtn = new Button("Exit");
	private final Text text = new Text(300, 100, "O AN QUAN");

	public MainSceneComponent() {
		
		playbtn.setLayoutX(475);
		playbtn.setLayoutY(200);
		rulebtn.setLayoutY(300);
		rulebtn.setLayoutX(475);
		exitbtn.setLayoutY(400);
		exitbtn.setLayoutX(475);
		text.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 80));
		this.getChildren().addAll(playbtn, rulebtn, exitbtn, text);
		
	}
}

