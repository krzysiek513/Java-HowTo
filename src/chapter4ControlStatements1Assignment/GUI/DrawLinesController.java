package chapter4ControlStatements1Assignment.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawLinesController {

    @FXML
    private Canvas canvas;

    @FXML
    void drawLineButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());
    }

    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int i = 0;
        while(i<20){
            i++;
            //gc.strokeLine(0, 0, 0, canvas.getHeight());
            gc.strokeLine(0, 0, 0 + (canvas.getWidth() / i), 360 - (canvas.getHeight() / i));
        }
        // gc.strokeLine(0, 0, 0, canvas.getHeight());
        // gc.strokeLine(0, 0, canvas.getWidth(), 0);
    }

    @FXML
    void draw4xLinesButtonPressed(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.strokeLine(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());
    }

    @FXML
    void clear(ActionEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // clear the canvas for next set of shapes
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

}
