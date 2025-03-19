package Elevator;

import java.util.ArrayList;
import java.util.List;

import Elevator.enums.Direction;
import Elevator.enums.ElevatorStatus;

public class ElevatorController {
    int controllerId;
    private Elevator elevator;

    public ElevatorController(int controllerId,int totalFloors){
        this.controllerId = controllerId;
        List<InternalButton> internalButtons = new ArrayList<>();
        for(int i=0;i<=totalFloors;i++){
            internalButtons.add(new InternalButton("floor"+i, "Floor-"+i));
        }
        this.elevator = new Elevator(controllerId, null, 0, new Display(null, 0), internalButtons, ElevatorStatus.IDLE);
        this.elevator.display.showDisplay("Inside Lift-"+controllerId);
    }

    public Elevator getElevator(){
        return elevator;
    }

    public void handleExternalRequest(int floor, Direction direction){
        
    }
    public void handleInternalRequest(int floor){
        
    }

}
