package ParkingLot;
import java.util.List;

public class TwoWheelPMSManager extends PMSManager{
    private static TwoWheelPMSManager instance;
    private TwoWheelPMSManager(List<ParkingSpot> parkingLot){
        super(parkingLot);
    }
    public static TwoWheelPMSManager getInstance(List<ParkingSpot> parkingLot) {
        if (instance == null) {
            instance = new TwoWheelPMSManager(parkingLot);
        }
        return instance;
    }
    @Override
    public ParkingSpot findParkingSpot(Vehicle v){
        ParkingSpot pk = null;
        return pk;
    }
}
