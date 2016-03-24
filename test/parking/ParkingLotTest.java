package parking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {

    private ParkingLot parkingLot;

    @Before
    public void setUp() throws Exception {
        parkingLot = ParkingLot.create(2);
    }

    @Test
    public void should_be_able_to_park_a_car_at_the_available_space() {
        assertTrue(parkingLot.parkCar(new Car()));
    }

    @Test
    public void should_not_be_able_to_park_a_car_when_it_is_full() {
        assertTrue(parkingLot.parkCar(new Car()));
        assertTrue(parkingLot.parkCar(new Car()));

        assertFalse(parkingLot.parkCar(new Car()));
    }

    @Test
    public void should_be_able_to_tell_when_it_is_full() {
        assertTrue(parkingLot.parkCar(new Car()));
        assertFalse(parkingLot.isFull());

        assertTrue(parkingLot.parkCar(new Car()));
        assertTrue(parkingLot.isFull());
    }
}