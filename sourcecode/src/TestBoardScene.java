import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class TestBoardScene extends Application {
	
	Line l1 = new Line();
	Line l2 = new Line();
	Line l3 = new Line();
	Line l4 = new Line();
	Line l5 = new Line();
	Line l6 = new Line();
	Line l7 = new Line();
	Line l8 = new Line();
	Line l9 = new Line();
	Arc l10 = new Arc(225, 300, 100, 100, 90, 180);
	Arc l11 = new Arc(725, 300, 100, 100, 270, 180);
	
	Cell r1 = new Cell(225, 200);
    Cell r2 = new Cell(325, 200);
    Cell r3 = new Cell(425, 200);
    Cell r4 = new Cell(525, 200);
    Cell r5 = new Cell(625, 200);
    Cell r11 = new Cell(225, 300);
    Cell r10 = new Cell(325, 300);
    Cell r9 = new Cell(425, 300);
    Cell r8 = new Cell(525, 300);
    Cell r7 = new Cell(625, 300);
    
    @Override
    public void start(Stage stage) {
    	
    	
    	   
 	   //drawing the board	   
        l1.setStartX(200+25);
        l1.setEndX(200+25);
        l1.setStartY(200);
        l1.setEndY(400);       
        l2.setStartX(300+25);
        l2.setEndX(300+25);
        l2.setStartY(200);
        l2.setEndY(400);       
        l3.setStartX(400+25);
        l3.setEndX(400+25);
        l3.setStartY(200);
        l3.setEndY(400);      
        l4.setStartX(500+25);
        l4.setEndX(500+25);
        l4.setStartY(200);
        l4.setEndY(400);     
        l5.setStartX(600+25);
        l5.setEndX(600+25);
        l5.setStartY(200);
        l5.setEndY(400);     
        l6.setStartX(700+25);
        l6.setEndX(700+25);
        l6.setStartY(200);
        l6.setEndY(400);      
        l7.setStartX(200+25);
        l7.setEndX(700+25);
        l7.setStartY(200);
        l7.setEndY(200);     
        l8.setStartX(200+25);
        l8.setEndX(700+25);
        l8.setStartY(400);
        l8.setEndY(400);     
        l9.setStartX(200+25);
        l9.setEndX(700+25);
        l9.setStartY(300);
        l9.setEndY(300);     
        l10.setFill(null);
        l10.setStrokeWidth(1);
        l10.setStroke(Color.BLACK);      
        l11.setFill(null);
        l11.setStroke(Color.BLACK);
        l11.setStrokeWidth(1);
        
       
        Group root = new Group(r1.rectangle, r2.rectangle, r3.rectangle, r4.rectangle, r5.rectangle,
        r7.rectangle, r8.rectangle, r9.rectangle, r10.rectangle, r11.rectangle);
        
        
        
        root.getChildren().addAll(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11);
        
        
        Scene scene = new Scene(root, 1000, 600, Color.WHEAT);
        stage.setScene(scene);
        stage.show();
    	
    }
    
    public static void main(String[] args) {
    	launch();
    }

}
