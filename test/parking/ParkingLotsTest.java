package parking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotsTest {

    private ParkingLots parkingLots;

    @Before
    public void setUp() throws Exception {
        parkingLots = new ParkingLots();
    }

    @Test
    public void should_be_able_to_add_a_parking_lot() {
        assertTrue(new ParkingLots().addParkingLot(ParkingLot.create(3)));
    }

    @Test
    public void should_be_able_to_park_a_car_to_parking_lot_when_there_is_space_in_parking_lot() {
        parkingLots.addParkingLot(ParkingLot.create(3));

        assertTrue(parkingLots.parkCar(new Car()));
    }

    @Test
    public void should_not_be_able_to_park_a_car_to_parking_lot_when_there_is_no_space_in_parking_lot() {
        parkingLots.addParkingLot(ParkingLot.create(1));

        assertTrue(parkingLots.parkCar(new Car()));

        assertFalse(parkingLots.parkCar(new Car()));
    }

    @Test
    public void should_give_true_when_all_Parking_lots_are_full() {
        parkingLots.addParkingLot(ParkingLot.create(0));
        parkingLots.addParkingLot(ParkingLot.create(0));

        assertTrue(parkingLots.isParkingLotFull());
    }

    @Test
    public void should_update_the_observer_status() {
        parkingLots.addParkingLot(ParkingLot.create(2));
        Display display = new Display();
        parkingLots.addObserver(display);

        assertFalse(display.isStatusChanged());

        parkingLots.parkCar(new Car());
        assertTrue(display.isStatusChanged());
    }

    @Test
    public void should_tell_the_total_capacity_it_has() {
        parkingLots.addParkingLot(ParkingLot.create(4));
        parkingLots.addParkingLot(ParkingLot.create(3));
        assertEquals(7, parkingLots.totalCapacity());
    }

    @Test
    public void should_tell_the_total_free_space_it_has() {

        ParkingLot parkingWith4Space = ParkingLot.create(4);
        parkingLots.addParkingLot(parkingWith4Space);

        ParkingLot parkingWith3Space = ParkingLot.create(3);
        parkingLots.addParkingLot(parkingWith3Space);

        parkingWith3Space.parkCar(new Car());
        parkingWith3Space.parkCar(new Car());

        parkingWith4Space.parkCar(new Car());
        assertEquals(4, parkingLots.availableParkingSpace());
    }

    @Test
    public void should_update_the_status_on_the_observer() {
        parkingLots.addParkingLot(ParkingLot.create(3));
        Display display = new Display();
        parkingLots.addObserver(display);
        
        assertFalse(display.isStatusChanged());

        parkingLots.parkCar(new Car());
        assertTrue(display.isStatusChanged());
    }
}