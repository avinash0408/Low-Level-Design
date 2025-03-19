package ParkingLot;

import java.util.List;

public abstract class PMSManager {
    private List<ParkingSpot> parkingLot;

    public PMSManager(List<ParkingSpot> parkingLot){
        this.parkingLot = parkingLot;
    }

    public List<ParkingSpot> getParkingLot() {
        return parkingLot;
    }

    public abstract ParkingSpot findParkingSpot(Vehicle v);

    public void addParkingSpot(ParkingSpot newSpot){
        parkingLot.add(newSpot);
    }

    public void removeParkingSpot(ParkingSpot spot){
        parkingLot.remove(spot);
    }

}
