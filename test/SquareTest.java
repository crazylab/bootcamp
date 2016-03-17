import exception.InvalidScaleValueException;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import quadrilaterals.Square;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createSquare_throws_exception_when_edge_is_less_than_zero() throws InvalidScaleValueException {
        thrown.expect(InvalidScaleValueException.class);
        thrown.expectMessage(CoreMatchers.is("Square edge should be positive but found -1.0"));

        Square.createSquare(-1);
    }

    @Test
    public void createSquare_throws_exception_when_edge_is_zero() throws InvalidScaleValueException {
        thrown.expect(InvalidScaleValueException.class);
        thrown.expectMessage(CoreMatchers.is("Square edge should be positive but found 0.0"));

        Square.createSquare(0);
    }

    @Test
    public void calculateArea_gives_100_when_edge_is_10() throws InvalidScaleValueException {
        Square square = Square.createSquare(10);
        assertEquals(100, square.calculateArea(), 0.5);
    }

    @Test
    public void calculatePerimeter_gives_20_when_edge_is_5() throws InvalidScaleValueException {
        Square square = Square.createSquare(5);
        assertEquals(20, square.calculatePerimeter(), 0.5);
    }
}