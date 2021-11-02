package selab.exp3;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public float computeArea() {
        return this.width * this.height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
