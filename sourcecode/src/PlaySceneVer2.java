import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PlaySceneVer2 extends Application {
	
	//for drawing the board

	
	Line l1 = new Line(225, 200, 225, 400);
	Line l2 = new Line(325, 200, 325, 400);
	Line l3 = new Line(425, 200, 425, 400);
	Line l4 = new Line(525, 200, 525, 400);
	Line l5 = new Line(625, 200, 625, 400);
	Line l6 = new Line(725, 200, 725, 400);
	Line l7 = new Line(225, 200, 725, 200);
	Line l8 = new Line(225, 300, 725, 300);
	Line l9 = new Line(225, 400, 725, 400);
	Arc l10 = new Arc(225, 300, 100, 100, 90, 180);
	Arc l11 = new Arc(725, 300, 100, 100, 270, 180);
	
	NormalCell c1 = new NormalCell(225, 200, 1);
    NormalCell c2 = new NormalCell(325, 200, 2);
    NormalCell c3 = new NormalCell(425, 200, 3);
    NormalCell c4 = new NormalCell(525, 200, 4);
    NormalCell c5 = new NormalCell(625, 200, 5);
    NormalCell c11 = new NormalCell(225, 300, 11);
    NormalCell c10 = new NormalCell(325, 300, 10);
    NormalCell c9 = new NormalCell(425, 300, 9);
    NormalCell c8 = new NormalCell(525, 300, 8);
    NormalCell c7 = new NormalCell(625, 300, 7);
    
    Group root = new Group();
    
    @Override
    public void start(Stage stage) {
	    	
	   root.getChildren().addAll(c1.rectangle, c1.text);
	   root.getChildren().addAll(c2.rectangle, c2.text);
	   root.getChildren().addAll(c3.rectangle, c3.text);
	   root.getChildren().addAll(c4.rectangle, c4.text);
	   root.getChildren().addAll(c5.rectangle, c5.text);
	   root.getChildren().addAll(c7.rectangle, c7.text);
	   root.getChildren().addAll(c8.rectangle, c8.text);
	   root.getChildren().addAll(c9.rectangle, c9.text);
	   root.getChildren().addAll(c10.rectangle, c10.text);
	   root.getChildren().addAll(c11.rectangle, c11.text);
	   
	   root.getChildren().addAll(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11);
	   
	   root.getChildren().addAll(c1.num_stone);
	   root.getChildren().addAll(c2.num_stone);
	   root.getChildren().addAll(c3.num_stone);
	   root.getChildren().addAll(c4.num_stone);
	   root.getChildren().addAll(c5.num_stone);
	   root.getChildren().addAll(c7.num_stone);
	   root.getChildren().addAll(c8.num_stone);
	   root.getChildren().addAll(c9.num_stone);
	   root.getChildren().addAll(c10.num_stone);
	   root.getChildren().addAll(c11.num_stone);
	   
	   Scene scene= new Scene(root, 1000, 800, Color.BLUEVIOLET);
	   stage.setScene(scene);
	   stage.show();
	   
	   c8.clockwise.setOnAction(new EventHandler<ActionEvent>() {
		   @Override
		   public void handle(ActionEvent e) {
			   while (c8.countStone() > 0) {
				   Path path = new Path();
				   Stone i = c8.num_stone.get(0);
				   c8.num_stone.remove(0);
				   path.getElements().add(new MoveTo(i.getCenterX(), i.getCenterY()));
				   path.getElements().add(new LineTo(500, 500));
				   PathTransition pathTransition = new PathTransition();  
				   pathTransition.setDuration(Duration.millis(100));  
				   pathTransition.setNode(i);  
				   pathTransition.setPath(path);  
				   pathTransition.play();
				   System.out.println(c8.countStone());
				   
			   }
			   
		   }
		   
	   });
    	
    }
	
    public static void main(String[]args) {
	    	launch();
    }
	       

}
