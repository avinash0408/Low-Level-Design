package ParkingLot;

public class TwoWheelCostCalcStrategy implements ICostCalcStrategy {
    private int basePrice = 5;
    public int computePrice(int timePeriodInMins){
        return (timePeriodInMins*basePrice)+10;
    }
}
