package gui;

import javafx.stage.Stage;

import gui.scene.Scene;
import gui.scene.component.ExitSceneComponent;
import gui.scene.component.MainSceneComponent;
import gui.scene.component.PlaySceneComponent;
import gui.scene.component.RulSceneComponent;
import javafx.application.Application;


public class GUI extends Application {
	ExitSceneComponent exitSceneComponent = new ExitSceneComponent(); 
	Scene exitScene = new Scene(exitSceneComponent);
	MainSceneComponent mainSceneComponent = new MainSceneComponent();
	Scene mainScene = new Scene(mainSceneComponent);
	PlaySceneComponent playSceneComponent = new PlaySceneComponent();
	Scene playScene = new Scene(playSceneComponent);
	RulSceneComponent ruleSceneComponent = new RulSceneComponent();
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