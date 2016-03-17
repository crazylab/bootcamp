package geometry.quadrilaterals;

import geometry.quadrilaterals.exception.InvalidScaleValueException;

// Square calculates area and perimeter of the square
//Square throws exception when positive value is not passed to it while creating it

public class Square extends Rectangle {
    public Square(double edge) {
        super(edge, edge);
    }

    public static Square createSquare(double edge) throws InvalidScaleValueException {
        if (edge <= 0)
            throw new InvalidScaleValueException("Square edge should be positive but found", edge);
        return new Square(edge);
    }
}
