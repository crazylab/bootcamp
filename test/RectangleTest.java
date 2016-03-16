import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void test_calcualteArea_gives_the_area_for_the_rectangle() throws Exception {
        Rectangle rectangle = new Rectangle(10, 2);
        assertEquals(20, rectangle.calcualteArea());

    }
}
