package selab.exp3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTests {
    private Rectangle rectangle;

    @Before
    public void setup() {
        this.rectangle = new Rectangle();
    }

    @Test
    public void computeArea_SampleHeightAndWidth_ReturnsCorrectArea() {
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        float area = rectangle.computeArea();
        Assert.assertEquals(50, area, 1e-10);
    }

    @Test
    public void computeArea_ZeroHeightOrWidth_ReturnsZeroArea() {
        rectangle.setHeight(0);
        rectangle.setWidth(5);

        float area = rectangle.computeArea();
        Assert.assertEquals(0, area, 1e-10);

        rectangle.setHeight(10);
        rectangle.setWidth(0);

        area = rectangle.computeArea();
        Assert.assertEquals(0, area, 1e-10);
    }

    @Test
    public void getHeight_SampleHeight_ReturnsCorrectHeight() {
        rectangle.setHeight(20);
        Assert.assertEquals(20, rectangle.getHeight(), 1e-10);
    }

    @Test
    public void getWidth_SampleWidth_ReturnsCorrectWidth() {
        rectangle.setWidth(30);
        Assert.assertEquals(30, rectangle.getWidth(), 1e-10);
    }
}
