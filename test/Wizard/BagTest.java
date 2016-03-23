package wizard;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class BagTest {

    private Ball blueBall;
    private Ball yellowBall;
    private Ball redBall;
    private Ball greenBall;

    @Before
    public void setUp() throws Exception {
        blueBall = Ball.createBlueBall();
        greenBall = Ball.createGreenBall();
        redBall = Ball.createRedBall();
        yellowBall = Ball.createYellowBall();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_be_able_to_add_ball_upto_the_given_limit() throws BagFullException {
        Bag bag = new Bag(3);
        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));

        thrown.expect(BagFullException.class);
        thrown.expectMessage(CoreMatchers.is("Bag can hold only 3 Balls"));
        bag.add(greenBall);
    }
}