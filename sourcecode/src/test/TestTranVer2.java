package test;
import board.NormalCell;
import board.Stone;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TestTranVer2 extends Application {
	
	
	Stone stone1 = new Stone(600, 600);
	Stone stone2 = new Stone(700, 700);
	NormalCell cell1 = new NormalCell(100, 100, 1);
	NormalCell cell2 = new NormalCell(700 , 100, 1);
	Button btnPlay = new Button("Play");
	
	public void start(Stage stage) {
		
		btnPlay.setLayoutX(800);
		btnPlay.setLayoutY(200);
		
		
		this.btnPlay.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Path path = new Path();  
			    path.getElements().add (new MoveTo (stone1.getCenterX(), stone1.getCenterY()));  
			    path.getElements().add (new LineTo (150, 150));  
			    PathTransition pathTransition = new PathTransition();  
			    pathTransition.setDuration(Duration.millis(100));  
			    pathTransition.setNode(stone1);  
			    pathTransition.setPath(path);  
			      			  
			    pathTransition.setAutoReverse(false);  
			    pathTransition.play();
			    cell1.num_stone.add(stone1);
			    stone1.setCenterX(150);
			    stone1.setCenterY(150);
			    
			    
			    
			    Path path2 = new Path();  
			    path2.getElements().add (new MoveTo (stone2.getCenterX(), stone2.getCenterY()));  
			    path2.getElements().add (new LineTo (750, 150));  
			    PathTransition pathTransition2 = new PathTransition();  
			    pathTransition2.setDuration(Duration.millis(2000));  
			    pathTransition2.setNode(stone2);  
			    pathTransition2.setPath(path2);  
			      			  
			    pathTransition2.setAutoReverse(false);  
			    pathTransition2.play();
			    cell2.num_stone.add(stone2);
			    stone2.setCenterX(150);
			    stone2.setCenterY(150);
			}
		});
		
		Group root = new Group(btnPlay);
		root.getChildren().add(cell1.rectangle);
		root.getChildren().addAll(cell1.num_stone);
		root.getChildren().add(stone1);
		root.getChildren().add(cell2.rectangle);
		root.getChildren().addAll(cell2.num_stone);
		root.getChildren().add(stone2);
		Scene scene = new Scene(root, 1000, 800);
		stage.setScene(scene);	
		stage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
