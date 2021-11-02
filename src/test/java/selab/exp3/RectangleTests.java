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
}
