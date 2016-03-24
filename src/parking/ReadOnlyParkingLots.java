package parking;

/*
can only get the status for parkingLots
 */

public class ReadOnlyParkingLots {
    private final ParkingLots parkingLots;

    public ReadOnlyParkingLots(ParkingLots parkingLots) {
        this.parkingLots = parkingLots;
    }

    public boolean isParkingLotFull() {
        return parkingLots.isParkingLotFull();
    }

    public int totalCapacity() {
        return parkingLots.totalCapacity();
    }

    public int availableParkingSpace() {
        return parkingLots.availableParkingSpace();
    }
}
