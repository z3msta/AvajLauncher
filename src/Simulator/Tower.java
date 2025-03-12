package Simulator;

import java.util.ArrayList;
import java.util.List;

public class Tower {

	private List<Flyable> observers = new ArrayList<>();

	public void register(Flyable p_flyable) {
		this.observers.add(p_flyable);
		System.out.println("TOWER: " + p_flyable.get);
	}

	public void unregister(Flyable p_flyable) {

	}

	protected void conditionChanged() {

	}
}
