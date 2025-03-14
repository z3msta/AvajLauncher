package Simulator;

public class WeatherTower extends Tower {

    private WeatherProvider weatherTower = WeatherProvider.getWeatherProvider();
    
    public String getWeather(Coordinates p_coordinates) {
        return weatherTower.getCurrentWeather(p_coordinates);
    }

    public void changeWeather() {
        this.conditionChanged();
    }
}
