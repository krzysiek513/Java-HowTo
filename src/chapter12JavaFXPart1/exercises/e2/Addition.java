package chapter12JavaFXPart1.exercises.e2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Addition extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Parent root =
                FXMLLoader.load(getClass().getResource("Addition.fxml"));

        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Addition"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage
    }

    public static void main(String[] args) {
        // create a TipCalculator object and call its start method
        launch(args);
    }
}