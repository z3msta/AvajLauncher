package Simulator;

//this class needs to define methods from abstract Simulator.Flyable class
public class Aircraft extends Flyable {

    protected long id;
    protected String name;
    protected String type;
    protected Coordinates coordinates;
    protected String currentWeather;

    public void updateConditions() {
    }

    public void printHeightInfo() {
        System.out.println("Current: " + this.type + "#" + this.name + "(" + this.id + "): " + this.coordinates.getHeight());

    }

    public void announceRegistration() {
        System.out.println("Tower says: " + this.type + "#" + this.name + "(" + this.id + ")" + " registered to weather tower");
    }

    public void announceLanding() {
        System.out.println("Tower says: " + this.type + "#" + this.name + "(" + this.id + ")" + " unregistered from weather tower");
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    protected Aircraft(String type, long p_id, String p_name, Coordinates p_coordinates) {
        this.type = type;
        this.id = p_id;
        this.name = p_name;
        this.coordinates = p_coordinates;
    }

}
