package Simulator;

public class AircraftFactory {

    private static AircraftFactory aircraftFactory = null;

    public static synchronized AircraftFactory getAircraftFactory() {
        if (aircraftFactory == null) {
            aircraftFactory = new AircraftFactory();
        }
        return aircraftFactory;
    }
//    public Simulator.Flyable newAircraft(String p_type, String p_name, Simulator.Coordinates p_coordinates){
//
//    }
}