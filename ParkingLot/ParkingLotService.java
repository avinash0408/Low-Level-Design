package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotService {
    private static final List<ParkingSpot> twoWheelerSpots = new ArrayList<>();
    private static final List<ParkingSpot> fourWheelerSpots = new ArrayList<>();

    static {
        for (int i = 1; i <= 10; i++) {
            twoWheelerSpots.add(new ParkingSpot(i));
        }
        for (int i = 11; i <= 20; i++) {
            fourWheelerSpots.add(new ParkingSpot(i));
        }
    }

    public static List<ParkingSpot> getSpots(VehicleType type) {
        if (type == VehicleType.TWO_WHEELER)
            return twoWheelerSpots;
        else if (type == VehicleType.FOUR_WHEELER)
            return fourWheelerSpots;
        else
            return null;
    }
}