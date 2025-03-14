package Simulator;

//this class needs to define methods from abstract Simulator.Flyable class
public class Aircraft extends Flyable {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    protected String currentWeather;

    public void updateConditions() {
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    protected Aircraft(long p_id, String p_name, Coordinates p_coordinates) {
        this.id = p_id;
        this.name = p_name;
        this.coordinates = p_coordinates;
    }

}
