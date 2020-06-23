package chapter6MethodsDeeper.GUI;

// Fig. 6.11: DrawSmileyController.java
// Drawing a smiley face using colors and filled shapes.
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawSmileyController {
    @FXML
    private Canvas canvas;

    // draws a smiley face
    @FXML
    void drawSmileyButtonPressed(ActionEvent event) {
        draw("smiley");
    }

    @FXML
    void drawBullseyeButtonPressed(ActionEvent event) {
        draw("bullsEye");
    }

    private void draw(String choice){
        // get the GraphicsContext, which is used to draw on the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // clear the canvas for next set of shapes
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        switch (choice) {
            case "smiley": // draw rectangles
                // draw the face
                gc.setFill(Color.YELLOW);
                gc.fillOval(10, 10, 280, 280);
                gc.strokeOval(10, 10, 280, 280);

                // draw the eyes
                gc.setFill(Color.BLACK);
                gc.fillOval(75, 85, 40, 40);
                gc.fillOval(185, 85, 40, 40);

                // draw the mouth
                gc.fillOval(50, 130, 200, 120);

                // "touch up" the mouth into a smile
                gc.setFill(Color.YELLOW);
                gc.fillRect(50, 130, 200, 60);
                gc.fillOval(50, 140, 200, 90);
                break;
            case "bullsEye": // draw bull`s eye

                int step = 10;
                boolean color = true;
                // draw 10 overlapping shapes
                for (int i = 0; i < 10; i++) {
                    if(color) {
                        gc.setFill(Color.DARKMAGENTA);
                    } else {
                        gc.setFill(Color.DARKORANGE);
                    }
                    color = !color;
                    gc.fillOval(30 + i * step, 10 + i * step, 340 - i * step, 340 - i * step);
                }
                break;
            default:
                gc.fillText("Błąd",10,10);
        }
    }
}