package GUI;
import javafx.scene.Scene;
import javafx.stage.Stage;
import scene.ExitScene;
import scene.MainScene;
import scene.PlayScene;
import scene.RuleScene;
import javafx.application.Application;


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