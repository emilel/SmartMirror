import Panels.Calendar;
import Panels.Clock;
import Panels.Messages;
import Panels.Weather;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(Clock.get());
        borderPane.setLeft(Calendar.get());
        borderPane.setRight(Weather.get());
        borderPane.setBottom(Messages.get());

        borderPane.setAlignment(borderPane.getTop(), Pos.CENTER);
        borderPane.setAlignment(borderPane.getBottom(), Pos.CENTER);
        borderPane.setMargin(borderPane.getBottom(), new Insets(100, 100, 100, 100));
        borderPane.setMargin(borderPane.getTop(), new Insets(30, 100, 30, 100));

        primaryStage.setScene(new Scene(borderPane, 600, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
