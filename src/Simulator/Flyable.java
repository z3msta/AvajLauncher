package Simulator;

public abstract class Flyable {

    protected WeatherTower weatherTower;

    public abstract void updateConditions();


    public abstract void announceRegistration();

    public abstract void announceLanding();


    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }
}
