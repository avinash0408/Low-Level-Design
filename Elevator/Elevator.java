package Elevator;

import java.util.List;

import Elevator.enums.Direction;
import Elevator.enums.ElevatorStatus;

public class Elevator {
    int elevatorId;
    Direction direction;
    int currentFloor;
    Display display;
    List<InternalButton> internalButtons;
    ElevatorStatus status;

    public Elevator(int elevatorId,Direction dir,int currentFloor,Display display,List<InternalButton> internalButtons,ElevatorStatus status){
        this.elevatorId = elevatorId;
        this.direction = dir;
        this.currentFloor = currentFloor;
        this.display = display;
        this.internalButtons = internalButtons;
        this.status = status;
    }
}
