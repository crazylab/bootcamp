package wizard.rules.exceptions;

import wizard.Color;
import wizard.rules.exceptions.RuleViolationForColorException;

public class YellowBallRuleViolationException extends RuleViolationForColorException {
    public YellowBallRuleViolationException(int limit) {
        super(Color.YELLOW, limit);
    }
}
