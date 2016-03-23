package wizard.rules;

import wizard.Color;

public class YellowBallRuleViolationException extends RuleViolationForColorException {
    public YellowBallRuleViolationException(int limit) {
        super(Color.YELLOW, limit);
    }
}
