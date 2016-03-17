package quadrilaterals;// Rectangle calculates area and perimeter of the rectangle
//Rectangle throws exception when positive value is not passed to it while creating it

import exception.InvalidScaleValueException;

public class Rectangle {
    private final double length;
    private final double width;

    public static Rectangle createRectangle(double length, double width) throws InvalidScaleValueException {
        if(length <= 0)
            throw new InvalidScaleValueException("Rectangle length should be positive but found", length);
        if(width <= 0)
            throw new InvalidScaleValueException("Rectangle width should be positive but found", width);
        return new Rectangle(length, width);
    }

    Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
