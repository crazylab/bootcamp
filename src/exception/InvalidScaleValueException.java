package exception;

public class InvalidScaleValueException extends Throwable {
    public InvalidScaleValueException(String message, double givenValue) {
        super(String.format("%s %s", message, new Double(givenValue).toString()));
    }
}
