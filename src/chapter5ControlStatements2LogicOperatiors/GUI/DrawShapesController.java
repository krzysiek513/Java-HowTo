package chapter5ControlStatements2LogicOperatiors.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawShapesController {

    @FXML
    private Canvas canvas;

    @FXML
    void drawOvalsButtonPressed(ActionEvent event) {
        draw("ovals");
    }

    @FXML
    void drawRectanglesButtonPressed(ActionEvent event) {
        draw("rectangles");
    }

    // draws rectangles or ovals based on which Button the user pressed
    public void draw(String choice) {
        // get the GraphicsContext, which is used to draw on the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // clear the canvas for next set of shapes
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        int step = 10;

        // draw 10 overlapping shapes
        for (int i = 0; i < 10; i++) {
            // pick the shape based on the user's choice
            switch (choice) {
                case "rectangles": // draw rectangles
                    gc.strokeRect(10 + i * step, 10 + i * step,
                            90 + i * step, 90 + i * step);
                    break;
                case "ovals": // draw ovals
                    gc.strokeOval(10 + i * step, 10 + i * step,
                            90 + i * step, 90 + i * step);
                    break;
            }
        }
    }

}
