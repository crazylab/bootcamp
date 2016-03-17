package geometry.quadrilaterals.exception;

public class InvalidScaleValueException extends Throwable {
    public InvalidScaleValueException(String message, double givenValue) {
        super(String.format("%s %s", message, givenValue));
    }
}
