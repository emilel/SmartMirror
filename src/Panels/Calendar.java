package Panels;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Calendar {
    public static Node get() {
        Label events = new Label("måndag - rocka fett\ntisdag - fest\nonsdag - tjäna miljoner\nsen sova");
        events.setFont(Font.font(16));
        return events;
    }
}
