package chapter10OOPPolymorphismInterface.GUI;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class MyShape {
    protected double x1; // x-coordinate of first endpoint
    protected double y1; // y-coordinate of first endpoint
    protected double x2; // x-coordinate of second endpoint
    protected double y2; // y-coordinate of second endpoint
    protected Color strokeColor; // color of this line
    protected int thicknesses;

    public MyShape() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.strokeColor = Color.BLACK;
        this.thicknesses = 0;
    }

    // constructor with input values
    public MyShape(
            double x1, double y1, double x2, double y2, Color strokeColor, int thicknesses) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.strokeColor = strokeColor;
        this.thicknesses = thicknesses;
}

    // draw the line in the specified color
    public abstract void draw(GraphicsContext gc);
}
