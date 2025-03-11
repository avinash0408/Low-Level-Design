package Observer;
import java.util.*;

interface IObserver{
    void update(String message);
}
class User implements IObserver{
    @Override
    public void update(String message) {
        System.out.println("User : "+message);
    }
}
class Rider implements IObserver{
    @Override
    public void update(String message) {
        System.out.println("Rider : "+message);
    }
}
class Agent implements IObserver{
    @Override
    public void update(String message) {
        System.out.println("Agent : "+message);
    }
}

class RideManager{
    private static List<IObserver> observers;
    public RideManager(){
        observers = new ArrayList<>();
    }
    
    public void addObserver(IObserver obj){
        observers.add(obj);
    }
    public void removeObserver(IObserver obj){
        observers.remove(obj);
    }
    public void updateAll(String msg){
        observers.forEach(obj -> {
            obj.update(msg);
        });
    }
}
public class Client {
    public static void main(String[] args) {
        RideManager rm1 = new RideManager();
        IObserver user = new User();
        IObserver rider = new Rider();
        IObserver agent= new Agent();
        rm1.addObserver(user);
        rm1.addObserver(rider);
        rm1.updateAll("Rider and User has been added.. !!");
        rm1.removeObserver(rider);
        rm1.addObserver(agent);
        rm1.updateAll("Riden has been removed, Agent has been added..!");
    }
}
