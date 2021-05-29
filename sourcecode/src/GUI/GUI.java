package GUI;
import javafx.scene.Scene;
import javafx.stage.Stage;

import scene.*;
import javafx.application.Application;


public class GUI extends Application {
	
	
	PlayScene playscene;
	RuleScene rulescene;
	MainScene mainscene;
	ExitScene exitscene;
	
	
	@Override
	public void start(Stage stage) {
		
		 
	    playscene = new PlayScene();
	    Scene playScene = playscene.playScene();
	    
	    rulescene = new RuleScene();
	    Scene ruleScene = rulescene.ruleScene();
	    
	    mainscene = new MainScene();
	    Scene mainScene = mainscene.mainScene();
	    
	    exitscene = new ExitScene();
	    Scene exitScene = exitscene.exitScene();
	    
	    //first scene when running
	    stage.setScene(mainScene);
	   

		

	    mainscene.playbtn.setOnAction(e -> stage.setScene(playScene));
		rulescene.returnbtn.setOnAction(e -> stage.setScene(mainScene));
		mainscene.rulebtn.setOnAction(e -> stage.setScene(ruleScene));		
		exitscene.yesbtn.setOnAction(e -> stage.close());
		exitscene.nobtn.setOnAction(e -> stage.setScene(mainScene));
		mainscene.exitbtn.setOnAction(e -> stage.setScene(exitScene));


	      stage.show();         
	  } 
		
	
	public static void main(String[] args) {
		launch();
	}
}