package Simulator;

import java.util.List;

import static java.lang.System.exit;


public class Parsing {

    public int fileParsing(List<String> data) {

        int nSimulations;
        try {
            nSimulations = Integer.parseInt(data.get(0));
            if (nSimulations < 0)
                return -1;
        } catch (NumberFormatException e) {
            return -1;
        }

        AircraftFactory aircraftFactory = AircraftFactory.getAircraftFactory();
        WeatherTower weatherTower = new WeatherTower();

        for (int j = 1; j < data.size(); j++) {
            if (data.get(j).split(" ").length != 5) {
                return -1;
            }
        }

        int i = 1;
        while (data.size() > i) {

            String[] currentAircraft = data.get(i).split(" ");

            Coordinates coordinates = new Coordinates();

            coordinates.setLongitude(Integer.parseInt(currentAircraft[2]));
            coordinates.setLatitude(Integer.parseInt(currentAircraft[3]));
            coordinates.setHeight(Integer.parseInt(currentAircraft[4]));

            Flyable aircraft = aircraftFactory.newAircraft(currentAircraft[0], currentAircraft[1], coordinates);
            aircraft.registerTower(weatherTower);

            if (aircraft == null)
                return -1;

            weatherTower.register(aircraft);
            i++;
        }

        RunSimulation simulator = new RunSimulation();
        simulator.beginSimulation(nSimulations, weatherTower);
        return 1;
    }
}
