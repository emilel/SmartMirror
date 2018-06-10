package Panels;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class Messages {
    public static Node get() {
        Label message = new Label("du måste tro på dig själv när ingen annan gör det");
        message.setFont(Font.font("Verdana", FontPosture.ITALIC, 12));
        return message;
    }
}
