package wizard.rules;

import wizard.Color;

public class RuleViolationForColorException extends Throwable {
    public RuleViolationForColorException(Color color, int limit) {
        super(String.format("Only %s %s Balls Allowed",  limit, color ));
    }
}
