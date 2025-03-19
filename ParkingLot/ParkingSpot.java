package ParkingLot;

public class ParkingSpot {
    private int spotId;
    private boolean isEmpty;
    private Vehicle vehicle;

    public ParkingSpot(int spotId){
        this.spotId = spotId;
        isEmpty = true;
        vehicle = null;
    }
    public void parkVehicle(Vehicle v){
        vehicle = v;
        isEmpty = false;
    }
    public void removeVehicle(Vehicle v){
        vehicle = null;
        isEmpty = true;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public int getSpotId() {
        return spotId;
    }
    public Boolean getIsEmpty(){
        return isEmpty;
    }
}
