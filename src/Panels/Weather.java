package Panels;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Weather {
    public static Node get() {
        Label weather = new Label("ruskigt soligt och 50 grader");
        weather.setFont(Font.font(16));
        return weather;
    }
}
