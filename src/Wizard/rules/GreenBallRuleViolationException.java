package wizard.rules;

import wizard.Color;

public class GreenBallRuleViolationException extends RuleViolationForColorException {
    public GreenBallRuleViolationException(int limit) {
        super(Color.GREEN, limit);
    }
}
