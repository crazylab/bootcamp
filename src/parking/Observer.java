package parking;

public interface Observer {
    void updateState(ReadOnlyParkingLots parkingLots);
}
