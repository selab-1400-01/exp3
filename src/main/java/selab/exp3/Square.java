package selab.exp3;

public class Square extends Rectangle {
    public Square(float side) {
        super(side, side);
    }

    public Square() {

    }

    @Override
    public void setHeight(float height) {
        this.setSide(height);
    }

    @Override
    public void setWidth(float width) {
        this.setSide(width);
    }

    public void setSide(float side) {
        super.setHeight(side);
        super.setWidth(side);
    }
}
