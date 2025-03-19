package ParkingLot;

public class CostCalcFactory {
    public ICostCalcStrategy getCostCalcStrategy(VehicleType vType){
        if(vType == VehicleType.TWO_WHEELER)
            return new TwoWheelCostCalcStrategy();
        else if (vType == VehicleType.FOUR_WHEELER)
            return new FourWheelCostCalcStrategy();
        else 
            return new TwoWheelCostCalcStrategy();
    }
}
