package ParkingLot;
import java.time.LocalDateTime;


public class EntranceGate {
    private int gateNumber;
    private PMSManagerFactory factory ;
    private PMSManager pmsManager;

    public EntranceGate(int gateNumber){
        this.gateNumber = gateNumber;
        factory = new PMSManagerFactory();
    }

    public int getGateNumber(){
        return gateNumber;
    }

    public Ticket generateTicket(Vehicle v){
        VehicleType vType= v.getVehicleType();
        pmsManager = factory.getPMSManager(vType);

        ParkingSpot pSpot = pmsManager.findParkingSpot(v);
        if(pSpot!=null){
            return new Ticket(LocalDateTime.now(), v, pSpot);
        }
        else{
            System.out.println("No Parking Spots available for "+ vType);
        }
        return null;
    }
}
