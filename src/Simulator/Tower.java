package Simulator;

import java.util.ArrayList;
import java.util.List;

public class Tower {

    private List<Flyable> observers = new ArrayList<>();

    public List<Flyable> getAircrafts() {
        return this.observers;
    }

    public void register(Flyable p_flyable) {

        this.observers.add(p_flyable);
        p_flyable.announceRegistration();
    }

    public void unregister(Flyable p_flyable) {

        for (int i = 0; i < observers.size(); i++)
            if (observers.get(i) == p_flyable) {
                p_flyable.announceLanding();
                observers.remove(i);
            }
    }

    protected void conditionChanged() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updateConditions();
        }
    }
}
