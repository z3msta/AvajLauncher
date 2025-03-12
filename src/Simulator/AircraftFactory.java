package Simulator;

import static java.lang.System.exit;

public class AircraftFactory {

	private static AircraftFactory aircraftFactory = null;

	public static synchronized AircraftFactory getAircraftFactory() {
		if (aircraftFactory == null) {
			aircraftFactory = new AircraftFactory();
		}
		return aircraftFactory;
	}

	private int ids = 0;

	public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {

		if (p_coordinates.getHeight() > 100)
			p_coordinates.setHeight(100);

		if (p_coordinates.getHeight() < 0 || p_coordinates.getLatitude() < 0 || p_coordinates.getLongitude() < 0) {

			System.out.println("Error: coordinates cannot be negative");
			exit(1);
		}

		switch (p_type) {
			case "Helicopter":
				return new Helicopter(ids++, p_name, p_coordinates);
			case "Baloon":
				return new Baloon(ids++, p_name, p_coordinates);
			case "JetPlane":
				return new JetPlane(ids++, p_name, p_coordinates);
			default:
				return null;
		}
	}
}