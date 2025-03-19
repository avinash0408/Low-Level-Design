package Elevator;

import Elevator.enums.Direction;

public class ExternalPanel {
    private int floorNumber;
    private IButton upButton;
    private IButton downButton;
    private ElevatorDispatcher dispatcher;
    public ExternalPanel(int floorNumber,ElevatorDispatcher dispatcher){
        this.floorNumber = floorNumber;
        this.upButton = new ExternalButton(Direction.UP,floorNumber,dispatcher);
        this.downButton = new ExternalButton(Direction.DOWN,floorNumber,dispatcher);
        this.dispatcher = dispatcher;
    }
    public void pressUp(){
        upButton.buttonPressed();
    }
    public void pressDown(){
        downButton.buttonPressed();
    }
}
