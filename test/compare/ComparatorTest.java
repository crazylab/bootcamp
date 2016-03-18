package compare;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ComparatorTest {
    @Test
    public void should_compare_feet_with_inches() throws Exception {
        Comparator comparator = new Comparator();
        assertTrue(comparator.compare(new Length(LengthUnit.FEET, 5), new Length(LengthUnit.INCH, 60)));
    }

    @Test
    public void should_compare_inches_with_centimeter() throws Exception {
        Comparator comparator = new Comparator();
        assertTrue(comparator.compare(new Length(LengthUnit.INCH, 2), new Length(LengthUnit.CENTIMETER, 5.08)));
    }

    @Test
    public void should_compare_centimeter_with_millimeter() throws Exception {
        Comparator comparator = new Comparator();
        assertTrue(comparator.compare(new Length(LengthUnit.CENTIMETER, 1), new Length(LengthUnit.MILLIMETER, 10)));
    }

    @Test
    public void should_compare_gallon_with_liter() throws Exception {
        Comparator comparator = new Comparator();
        assertTrue(comparator.compare(new Volume(VolumeUnit.GALLON, 1), new Volume(VolumeUnit.LITER, 3.78)));
    }
}