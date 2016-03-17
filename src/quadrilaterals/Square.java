package quadrilaterals;

import exception.InvalidScaleValueException;

public class Square extends Rectangle {
    public Square(double edge) {
        super(edge,edge);
    }

    public static Square createSquare(double edge) throws InvalidScaleValueException {
        if(edge <= 0)
            throw new InvalidScaleValueException("Square edge should be positive but found", edge);
        return new Square(edge);
    }
}
