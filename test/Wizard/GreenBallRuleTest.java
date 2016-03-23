package wizard;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.rules.ExpectedException;
import wizard.rules.GreenBallRule;
import wizard.rules.GreenBallRuleViolationException;

import static org.junit.Assert.assertTrue;

public class GreenBallRuleTest {

    private GreenBallRule greenBallRule;
    private Balls balls;
    private Ball greenBall;

    @Before
    public void setUp() throws Exception {
        greenBallRule = new GreenBallRule(3);
        balls = new Balls();
        greenBall = Ball.createGreenBall();
    }

    @org.junit.Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_allow_green_balls_upto_the_given_limt() throws GreenBallRuleViolationException {
        balls.add(greenBall);
        balls.add(greenBall);
        balls.add(greenBall);
        ReadOnlyBalls readOnlyBalls = new ReadOnlyBalls(balls);

        thrown.expect(GreenBallRuleViolationException.class);
        thrown.expectMessage(CoreMatchers.is("Only 3 GREEN Balls Allowed"));
        greenBallRule.checkRuleViolationToAddNewBall(greenBall, readOnlyBalls);
    }

    @Test
    public void should_not_throws_exception_until_rule_is_violated() throws GreenBallRuleViolationException {
        balls.add(greenBall);
        balls.add(greenBall);

        ReadOnlyBalls readOnlyBalls = new ReadOnlyBalls(balls);
        greenBallRule.checkRuleViolationToAddNewBall(greenBall, readOnlyBalls);

        assertTrue(true);
    }
}