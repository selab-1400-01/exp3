package selab.exp3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTests {
    @Test
    public void computeArea_SampleHeightAndWidth_ReturnsCorrectArea() {
        Rectangle rectangle = new Rectangle(10, 5);
        float area = rectangle.computeArea();
        Assert.assertEquals(50, area, 1e-10);
    }

    @Test
    public void computeArea_ZeroHeightOrWidth_ReturnsZeroArea() {
        Rectangle rectangle = new Rectangle(0, 5);
        float area = rectangle.computeArea();
        Assert.assertEquals(0, area, 1e-10);

        Rectangle rectangle = new Rectangle(10, 0);
        area = rectangle.computeArea();
        Assert.assertEquals(0, area, 1e-10);
    }

}
