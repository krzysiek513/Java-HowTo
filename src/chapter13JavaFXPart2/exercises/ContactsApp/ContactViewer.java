package chapter13JavaFXPart2.exercises.ContactsApp;

// Fig. 13.13: CoverViewer.java
// Main application class that loads and displays the CoverViewer's GUI.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactViewer extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root =
                FXMLLoader.load(getClass().getResource("ContactViewer.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Contact Viewer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
