package chance.exception;

public class InvalidChanceException extends Throwable {
    public InvalidChanceException(double chance) {
        super(String.format("Chance should be between 0 and 1 but found %s", chance));
    }
}
