package Panels;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
    public static Node get() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        Label clock = new Label(dateFormat.format(date));
        clock.setFont(Font.font(50));
        return clock;
    }
}
