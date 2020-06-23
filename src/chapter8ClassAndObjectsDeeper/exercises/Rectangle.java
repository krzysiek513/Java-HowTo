package chapter8ClassAndObjectsDeeper.exercises;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        length = 1f;
        width = 1f;
    }

    public float perimeter(){
        return 2 * length + 2 * width;
    }

    public float area(){
        return length * width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length < 0.0f || length > 20.0f) {
            throw new IllegalArgumentException("length need to be 0.0-20.0");
        }
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width < 0.0f || width > 20.0f) {
            throw new IllegalArgumentException("width need to be 0.0-20.0");
        }
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
