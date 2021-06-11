package gui;

import javafx.stage.Stage;

import scene.*;
import javafx.application.Application;


public class GUI extends Application {
	ExitScene exitSceneComponent = new ExitScene(); 
	Scene exitScene = new Scene(exitSceneComponent);
	MainScene mainSceneComponent = new MainScene();
	Scene mainScene = new Scene(mainSceneComponent);
	PlayScene playSceneComponent = new PlayScene();
	Scene playScene = new Scene(playSceneComponent);
	RuleScene ruleSceneComponent = new RuleScene();
	Scene ruleScene = new Scene(ruleSceneComponent);
	
	
	
	
	
	
	@Override
	public void start(Stage stage) {
			    
	    //first scene when running
	    stage.setScene(mainScene);
	    mainSceneComponent.playbtn.setOnAction(e -> stage.setScene(playScene));
		ruleSceneComponent.returnbtn.setOnAction(e -> stage.setScene(mainScene));
		mainSceneComponent.rulebtn.setOnAction(e -> stage.setScene(ruleScene));		
		exitSceneComponent.yesbtn.setOnAction(e -> stage.close());
		exitSceneComponent.nobtn.setOnAction(e -> stage.setScene(mainScene));
		mainSceneComponent.exitbtn.setOnAction(e -> stage.setScene(exitScene));


	    stage.show();         
	  } 
		
	
	public static void main(String[] args) {
		launch();
	}
}