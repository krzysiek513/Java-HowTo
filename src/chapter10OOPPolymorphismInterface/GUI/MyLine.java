package chapter10OOPPolymorphismInterface.GUI;

import javafx.scene.canvas.GraphicsContext;

public class MyLine extends MyShape{

    public void draw(GraphicsContext gc) {
        gc.setLineWidth(thicknesses);
        gc.setStroke(strokeColor);
        gc.strokeLine(x1, y1, x2, y2);
    }
}
