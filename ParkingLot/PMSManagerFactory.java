package ParkingLot;
import java.util.List;

public class PMSManagerFactory {
    public PMSManager getPMSManager(VehicleType type){
        List<ParkingSpot> parkingLot = ParkingLotService.getSpots(type);
        if(type == VehicleType.TWO_WHEELER)
            return TwoWheelPMSManager.getInstance(parkingLot);
        else if(type == VehicleType.FOUR_WHEELER)
            return  FourWheelPMSManager.getInstance(parkingLot);
        else
            return null;
    }
}
