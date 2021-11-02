package selab.exp3;

import org.junit.Assert;
import org.junit.Test;

public class SquareTests {
    @Test
    public void computeArea_SampleSide_ReturnsSquareOfSide() {
        Square square = new Square(5);
        float area = square.computeArea();
        Assert.assertEquals(25, area, 1e-10);
    }
}
