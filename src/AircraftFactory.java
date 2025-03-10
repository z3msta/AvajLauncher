public class AircraftFactory {

    private static AircraftFactory aircraftFactory = null;

    public static synchronized AircraftFactory getAircraftFactory() {
        if (aircraftFactory == null) {
            aircraftFactory = new AircraftFactory();
        }
        return aircraftFactory;
    }
//    public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates){
//
//    }
}