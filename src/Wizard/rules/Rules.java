package wizard.rules;

import wizard.Ball;
import wizard.balls.ReadOnlyBalls;
import wizard.rules.exceptions.RuleViolationForColorException;

import java.util.ArrayList;
import java.util.List;

public class Rules {
    private final List<Rule> rules = new ArrayList<Rule>();

    public void addRule(Rule rule){
        rules.add(rule);
    }

    public void cryWhenRuleViolated(Ball ball, ReadOnlyBalls balls) throws RuleViolationForColorException {
        for (Rule rule : rules) {
            rule.checkRuleViolationToAddNewBall(ball,balls);
        }
    }
}
