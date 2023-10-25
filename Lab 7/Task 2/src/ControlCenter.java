import java.util.ArrayList;
import java.util.List;

public class ControlCenter {
    private List<Observer> observers;

    public ControlCenter() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void openAllDoors() {
        for (Observer observer : observers) {
            observer.updateDoorOpen();
        }
    }

    public void closeAllDoors() {
        for (Observer observer : observers) {
            observer.updateDoorClose();
        }
    }
}