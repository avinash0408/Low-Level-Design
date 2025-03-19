package ParkingLot;

public class FourWheelCostCalcStrategy implements ICostCalcStrategy {
    private int basePrice = 10;
    public int computePrice(int timePeriodInMins){
        return (timePeriodInMins*basePrice)+15;
    }
}
