package chapter8ClassAndObjectsDeeper.GUI;

// Fig. 8.18: DrawRandomLinesController.java
// Drawing random lines using MyLine objects.
import java.security.SecureRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawRandomLinesController {
    private static final SecureRandom randomNumbers = new SecureRandom();
    @FXML private Canvas canvas;

    // draws random lines
    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
        // get the GraphicsContext, which is used to draw on the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        MyLine[] lines = new MyLine[100]; // stores the MyLine objects

        final int width = (int) canvas.getWidth();
        final int height = (int) canvas.getHeight();

        // create lines
        for (int count = 0; count < lines.length; count++) {
            // generate random coordinates
            double x1 = randomNumbers.nextInt(width);
            double y1 = randomNumbers.nextInt(height);
            double x2 = randomNumbers.nextInt(width);
            double y2 = randomNumbers.nextInt(height);

            int thicknesses = randomNumbers.nextInt(11);

            // generate a random color
            Color color = Color.rgb(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            // add a new MyLine to the array
            lines[count] = new MyLine(x1, y1, x2, y2, color, thicknesses);
        }

        // clear the Canvas then draw the lines
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (MyLine line : lines) {
            line.draw(gc);
        }
    }
}
