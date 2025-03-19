package ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGate {
    public void processExit(Ticket ticket){
        Vehicle v = ticket.getVehicle();
        VehicleType vType = v.getVehicleType();
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        Duration duration = Duration.between(entryTime, exitTime);
        int minutes = (int) duration.toMinutes(); 

        CostCalcFactory strategyFactory = new CostCalcFactory();
        ICostCalcStrategy strategy =  strategyFactory.getCostCalcStrategy(vType);

        int cost = strategy.computePrice(minutes);

        System.out.println("Parking cost for Vehicle - "+ v.getVehicleNumber()+" is: Rs."+cost);

        ParkingSpot pSpot = ticket.getParkingSpot();
        pSpot.removeVehicle(v);


    }
}
