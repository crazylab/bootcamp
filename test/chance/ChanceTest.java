package chance;

import chance.exception.InvalidChanceException;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChanceTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_throw_InvalidChanceException_when_chance_is_less_than_zero() throws InvalidChanceException {
        thrown.expect(InvalidChanceException.class);
        thrown.expectMessage(CoreMatchers.is("Chance should be between 0 and 1 but found -1.0"));
        Chance.create(-1);
    }

    @Test
    public void should_throw_InvalidChanceException_when_chance_is_more_than_1() throws InvalidChanceException {
        thrown.expect(InvalidChanceException.class);
        thrown.expectMessage(CoreMatchers.is("Chance should be between 0 and 1 but found 1.3"));
        Chance.create(1.3);
    }

    @Test
    public void should_returns_true_when_another_event_has_same_chance() throws InvalidChanceException {
        Chance tailChance = Chance.create(0.5);
        Chance expected = Chance.create(0.5);

        assertTrue(tailChance.equals(expected));
        assertFalse(tailChance.equals(Chance.create(0.1)));
    }

    @Test
    public void should_give_chance_of_not_occurring_an_event() throws InvalidChanceException {
        Chance tailChance = Chance.create(0.4);
        assertTrue(tailChance.not().equals(Chance.create(0.6)));
    }
    @Test
    public void should_give_chances_of_occurring_2_events() throws InvalidChanceException {
        Chance tail = Chance.create(0.5);
        Chance allAreTail = tail.and(tail);
        assertTrue(allAreTail.equals(Chance.create(0.25)));
    }

    @Test
    public void should_give_chances_of_occurring_any_one_of_the_event() throws InvalidChanceException {
        Chance tail = Chance.create(0.5);
        assertTrue(tail.or(tail).equals(Chance.create(0.75)));
    }

}