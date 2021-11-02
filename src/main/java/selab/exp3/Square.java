package selab.exp3;

public class Square extends Rectangle {
    public Square(float side) {
        super(side, side);
    }

    public Square() {

    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
