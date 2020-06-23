package chapter7ArrayArratLists.GUI;

// Fig. 7.25: DrawRainbowController.java
// Drawing a rainbow using arcs.
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class DrawRainbowController {
    @FXML private Canvas canvas;

    // colors to use in the rainbow, starting from the innermost
    // The two white entries result in an empty arc in the center
    private final Color[] colors = {
            Color.WHITE, Color.WHITE, Color.VIOLET, Color.INDIGO, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

    // draws a rainbow using arcs
    @FXML
    void drawRainbowButtonPressed(ActionEvent event) {
        // get the GraphicsContext, which is used to draw on the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        final int radius = 20; // radius of an arc

        // draw the rainbow near the bottom-center
        final double centerX = canvas.getWidth() / 2;
        final double maxY = canvas.getHeight() - 10;

        // draws filled arcs starting with the outermost
        for (int counter = colors.length; counter > 0; counter--) {
            // set the color for the current arc
            gc.setFill(colors[counter - 1]);

            // fill the arc from 0 to 180 degrees
            gc.fillArc(centerX - counter * radius,
                    maxY - counter * radius, counter * radius * 2,
                    counter * radius * 2, 0, 180, ArcType.OPEN);
        }
    }
}

