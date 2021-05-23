import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GUI extends Application {
	
	
	PlayScene a;
	RuleScene b;
	MainScene c;
	ExitScene d;
	
	
	@Override
	public void start(Stage stage) {
		
		 
	    a = new PlayScene();
	    Scene playScene = a.playScene();
	    
	    b = new RuleScene();
	    Scene ruleScene = b.ruleScene();
	    
	    c = new MainScene();
	    Scene mainScene = c.mainScene();
	    
	    d = new ExitScene();
	    Scene exitScene = d.exitScene();
	    
	    //first scene when running
	    stage.setScene(mainScene);
	   
	

		

	    c.playbtn.setOnAction(e -> stage.setScene(playScene));
		b.returnbtn.setOnAction(e -> stage.setScene(mainScene));
		c.rulebtn.setOnAction(e -> stage.setScene(ruleScene));		
		d.yesbtn.setOnAction(e -> stage.close());
		d.nobtn.setOnAction(e -> stage.setScene(mainScene));
		c.exitbtn.setOnAction(e -> stage.setScene(exitScene));


	      stage.show();         
	  } 
		
	
	public static void main(String[] args) {
		launch();
	}
}