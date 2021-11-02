package selab.exp3;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float computeArea() {
        return this.width * this.height;
    }
}
