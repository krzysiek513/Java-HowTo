package chapter12JavaFXPart1.exercises.e1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Welcome extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Parent root =
                FXMLLoader.load(getClass().getResource("Welcome.fxml"));

        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Welcome"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage
    }

    public static void main(String[] args) {
        // create a TipCalculator object and call its start method
        launch(args);
    }
}