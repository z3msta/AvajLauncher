package Simulator;

import java.util.List;

import static java.lang.System.exit;


public class Parsing {

    public void fileParsing(List<String> data) throws ParsingErrorException {

        int nSimulations;

        try {
            nSimulations = Integer.parseInt(data.getFirst());
        } catch (NumberFormatException e) {
            throw new ParsingErrorException("PARSING ERROR: Number of simulation runs not valid");
        }

        if (nSimulations < 0)
            throw new ParsingErrorException("PARSING ERROR: Number of simulation runs not valid");


        AircraftFactory aircraftFactory = AircraftFactory.getAircraftFactory();
        WeatherTower weatherTower = new WeatherTower();

        for (int j = 1; j < data.size(); j++) {
            if (data.get(j).split(" ").length != 5) {
                throw new ParsingErrorException("PARSING ERROR AT LINE " + (j + 1) + ": Number of attributes for AirCraft not valid");
            }
        }

        int i = 1;
        while (data.size() > i) {

            String[] currentAircraft = data.get(i).split(" ");

            Coordinates coordinates = new Coordinates();

            try {
                coordinates.setLongitude(Integer.parseInt(currentAircraft[2]));
                coordinates.setLatitude(Integer.parseInt(currentAircraft[3]));
                coordinates.setHeight(Integer.parseInt(currentAircraft[4]));
            } catch (NumberFormatException e) {
                throw new ParsingErrorException("PARSING ERROR AT LINE " + (i + 1) + ": Couldn't convert string to int");
            }

            Flyable aircraft = null;
            try {
                aircraft = aircraftFactory.newAircraft(currentAircraft[0], currentAircraft[1], coordinates);
            } catch (InvalidAirCraftName e) {
                System.out.println("PARSING ERROR AT LINE " + (i + 1) + ": No match for AirCraft name --> " + currentAircraft[0]);
                exit(1);
            }
            aircraft.registerTower(weatherTower);
            weatherTower.register(aircraft);
            i++;
        }

        RunSimulation simulator = new RunSimulation();
        simulator.beginSimulation(nSimulations, weatherTower);
    }
}
