import com.math.Area;
import com.math.Perimeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void test_calculate_does_the_given_operation_when_asked_for_area() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(50, rectangle.calcualte(new Area()));
    }

    @Test
    public void test_calculate_does_the_given_operation_when_asked_for_perimeter() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(30, rectangle.calcualte(new Perimeter()));
    }
}
