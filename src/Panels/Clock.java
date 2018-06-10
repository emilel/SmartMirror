package Panels;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Clock {
    public static Node get() {
        Label clock = new Label("13:37");
        clock.setFont(Font.font(48));
        return clock;
    }
}
