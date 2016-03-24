package parking;

public class Display implements Observer{
        private boolean updationStatus = false;
        public void updateState(ParkingLots parkingLots){
            updationStatus=true;
        }

    @Override
    public void updateState(ReadOnlyParkingLots parkingLots) {
        this.updationStatus = true;
    }

    public boolean isStatusChanged(){
        return updationStatus == true;
    }
}
