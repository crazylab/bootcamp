package parking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ReadOnlyParkingLotsTest {

    private ParkingLots parkingLots;

    @Before
    public void setUp() throws Exception {
        parkingLots = new ParkingLots();
        parkingLots.addParkingLot(ParkingLot.create(2));
        parkingLots.addParkingLot(ParkingLot.create(1));


    }

    @Test
    public void should_tell_true_when_parking_space_is_full () {
        parkingLots.parkCar(new Car());
        parkingLots.parkCar(new Car());
        parkingLots.parkCar(new Car());
        ReadOnlyParkingLots readOnlyParkingLots = new ReadOnlyParkingLots(parkingLots);
        assertTrue(readOnlyParkingLots.isParkingLotFull());
    }

    @Test
    public void should_tell_false_when_parking_space_is_not_full () {
        parkingLots.parkCar(new Car());
        parkingLots.parkCar(new Car());
        ReadOnlyParkingLots readOnlyParkingLots = new ReadOnlyParkingLots(parkingLots);
        assertFalse(readOnlyParkingLots.isParkingLotFull());
    }

    @Test
    public void should_give_the_total_capacity_of_parkingLots() {
        parkingLots.parkCar(new Car());
        parkingLots.parkCar(new Car());
        ReadOnlyParkingLots readOnlyParkingLots = new ReadOnlyParkingLots(parkingLots);
        assertEquals(3,readOnlyParkingLots.totalCapacity());

    }
    @Test
    public void should_give_the_total_available_space_in_parkingLots() {
        parkingLots.parkCar(new Car());
        parkingLots.parkCar(new Car());
        ReadOnlyParkingLots readOnlyParkingLots = new ReadOnlyParkingLots(parkingLots);
        assertEquals(1,readOnlyParkingLots.availableParkingSpace());

    }
}