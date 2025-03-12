package Simulator;

import java.util.ArrayList;
import java.util.List;

public class Tower {

	private List<Flyable> observers = new ArrayList<>();

	public void announceRegistration(String name) {
		System.out.println("Tower: " + name + " registered to weather tower.");
	}

	public void register(Flyable p_flyable) {
		this.observers.add(p_flyable);
	}

	public void unregister(Flyable p_flyable) {

	}

	protected void conditionChanged() {

	}
}
