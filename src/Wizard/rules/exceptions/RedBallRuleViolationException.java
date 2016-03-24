package wizard.rules.exceptions;

import wizard.Color;

public class RedBallRuleViolationException extends RuleViolationForColorException {
    public RedBallRuleViolationException(int limit) {
        super(Color.RED, limit);
    }
}
