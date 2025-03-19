package Elevator;

import Elevator.enums.Direction;

public class Display {
    Direction dir;
    int currentFloor;
    public Display(Direction dir,int currentFloor){
        this.dir = dir;
        this.currentFloor = currentFloor;
    }
    public void showDisplay(String intOrExt){
        System.out.println(intOrExt + " : Lift is currently on Floor-" + currentFloor + 
                   ((dir != null) ? " and is moving " + dir.toString() : ""));
    }
}
