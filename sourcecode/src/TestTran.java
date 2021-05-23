



import javafx.animation.PathTransition;  
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;  
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;  
import javafx.scene.shape.Path;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class TestTran extends Application{  
@Override  
public void start(Stage primaryStage) throws Exception {  
	
	
	Circle point = new Circle();
	Button btnRun = new Button("Run");
	btnRun.setLayoutX(100);
	btnRun.setLayoutY(100);
	btnRun.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			point.setLayoutX(100);
			point.setLayoutX(100);
			point.setRadius(20);
			point.setFill(Color.BLANCHEDALMOND);
			 
		    Path path = new Path();  
		    path.getElements().add (new MoveTo (150f, 70f));  
		    path.getElements().add (new LineTo (640f, 700f));  
		      

		    PathTransition pathTransition = new PathTransition();  
		    pathTransition.setDuration(Duration.millis(1000));  
		    pathTransition.setNode(point);  
		 
		    pathTransition.setPath(path);  
		      
		  
		    pathTransition.setAutoReverse(false);  
		  

		    pathTransition.play();
		}
		
	});
    
	  
      
    //Configuring group and scene   
    Group root = new Group(btnRun, point);  

    Scene scene = new Scene(root, 1000, 800, Color.WHEAT);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Test Transition");  
    primaryStage.show();  
}  
public static void main(String[] args) {  
    launch(args);  
}  
  
}  