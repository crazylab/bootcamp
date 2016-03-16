import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createRectangle_throws_exception_when_length_and_width_is_less_than_equals_zero() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Rectangle length, width should be positive");

        Rectangle.createRectangle(0, 0);
        Rectangle.createRectangle(-1, -5);
    }

    @Test
    public void createRectangle_throws_exception_when_length_is_less_than_equals_zero() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Rectangle length, width should be positive");

        Rectangle.createRectangle(0, 10);
        Rectangle.createRectangle(-25, 5);
    }

    @Test
    public void createRectangle_throws_exception_when_width_is_less_than_equals_zero() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Rectangle length, width should be positive");

        Rectangle.createRectangle(32, 0);
        Rectangle.createRectangle(50, -10);
    }

    @Test
    public void calculateArea_gives_50_when_lenght_is_10_and_width_is_5() throws Exception {
        Rectangle rectangle = Rectangle.createRectangle(10, 5.5);
        assertEquals(55, rectangle.calculateArea(), 0.5);
    }

    @Test
    public void calculatePerimeter_gives_30_when_length_is_5_and_width_is_10() throws Exception {
        Rectangle rectangle = Rectangle.createRectangle(5, 10);
        assertEquals(30, rectangle.calcualtePerimeter(), 0.5);
    }

}
