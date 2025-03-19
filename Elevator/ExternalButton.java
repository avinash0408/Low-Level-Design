package Elevator;

import Elevator.enums.Direction;

public class ExternalButton implements IButton {
    private Direction direction;
    private int floor;
    private ElevatorDispatcher dispatcher;
    public ExternalButton(Direction direction,int floor,ElevatorDispatcher dispatcher){
        this.floor = floor;
        this.direction = direction;
        this.dispatcher = dispatcher;
    }
    @Override
    public void buttonPressed(){
        dispatcher.requestElevator(floor, direction);
    }
}
