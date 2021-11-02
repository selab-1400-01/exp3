package selab.exp3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTests {
    private Square square;

    @Before
    public void setup() {
        this.square = new Square();
    }

    @Test
    public void computeArea_SampleSide_ReturnsSquareOfSide() {
        Square square = new Square(5);
        float area = square.computeArea();
        Assert.assertEquals(25, area, 1e-10);
    }

    @Test
    public void getHeight_WhenWidthIsSet_ReturnsWidth() {
        this.square.setWidth(10);
        Assert.assertEquals(10, this.square.getHeight(), 1e-10);
    }

    @Test
    public void getWidth_WhenHeightIsSet_ReturnsHeight() {
        this.square.setHeight(20);
        Assert.assertEquals(20, this.square.getWidth(), 1e-10);
    }
}
