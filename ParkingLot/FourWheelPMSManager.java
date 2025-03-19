package ParkingLot;
import java.util.List;

public class FourWheelPMSManager extends PMSManager{
    private static FourWheelPMSManager instance;
    private FourWheelPMSManager(List<ParkingSpot> parkingLot){
        super(parkingLot);
    }
    public static FourWheelPMSManager getInstance(List<ParkingSpot> parkingLot) {
        if (instance == null) {
            instance = new FourWheelPMSManager(parkingLot);
        }
        return instance;
    }
    @Override
    public ParkingSpot findParkingSpot(Vehicle v){
        ParkingSpot pk = null;
        return pk;
    }
}
