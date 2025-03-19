package Elevator;

import java.util.List;

import Elevator.enums.Direction;
import Elevator.enums.ElevatorStatus;

public class ElevatorDispatcher {
    List<ElevatorController> controllers;
    public ElevatorDispatcher(List<ElevatorController> controllers) {
        this.controllers = controllers;
    }
    public void requestElevator(int floor,Direction direction){
        ElevatorController bestController = this.findBestController(floor,direction);
        if(bestController!=null){
            bestController.handleExternalRequest(floor, direction);
        }else {
            System.out.println("No available elevators at the moment.");
        }
    }
    public ElevatorController findBestController(int floor, Direction direction){
        ElevatorController bestController = null;
        int minDistance = Integer.MAX_VALUE;
        for(ElevatorController ec : controllers){
            Elevator e = ec.getElevator();
            int distance = Math.abs(e.currentFloor - floor);
            if(e.status == ElevatorStatus.IDLE){
                return ec;
            }
            if(e.direction == direction){
                if(distance < minDistance){
                    minDistance = distance;
                    bestController = ec;
                }
            }
        }
        return bestController;
    }
}
