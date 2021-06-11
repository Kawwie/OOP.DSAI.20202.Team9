package scene;
import gui.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ExitScene extends javafx.scene.Group{
	public Button yesbtn = new Button("Yes");
	public Button nobtn = new Button("No");
	private Text confirmexit = new Text("Are you sure want to quit ?");
	public ExitScene() {
		confirmexit.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 40));
		confirmexit.setLayoutX(250);
		confirmexit.setLayoutY(100);
		yesbtn.setLayoutY(200);
		nobtn.setLayoutY(300);
		yesbtn.setLayoutX(500);
		nobtn.setLayoutX(500);
		this.getChildren().addAll(yesbtn, nobtn, confirmexit);
	
	}
}
