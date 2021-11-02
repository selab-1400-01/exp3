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

    public final float computeArea() {
        return this.width * this.height;
    }

    public final float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public final float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
