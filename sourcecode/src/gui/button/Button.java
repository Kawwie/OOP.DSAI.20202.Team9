package gui.button;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Button extends javafx.scene.control.Button{
	public Button(String text) {
		this.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.ITALIC, 20));
		this.setPrefSize(100, 30);
		this.setText(text);
	}
}
