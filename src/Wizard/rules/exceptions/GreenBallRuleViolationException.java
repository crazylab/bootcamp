package wizard.rules.exceptions;

import wizard.Color;

public class GreenBallRuleViolationException extends RuleViolationForColorException {
    public GreenBallRuleViolationException(int limit) {
        super(Color.GREEN, limit);
    }
}
