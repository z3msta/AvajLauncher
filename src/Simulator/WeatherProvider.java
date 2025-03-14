package Simulator;

import java.util.Random;

public class WeatherProvider extends Tower {

    private static WeatherProvider provider = null;

    public static WeatherProvider getWeatherProvider() {
        if (provider == null) {
            provider = new WeatherProvider();
        }
        return provider;
    }

    private String[] weather = {"FOG", "RAIN", "SUN", "SNOW"};

//    private WeatherProvider() {
//
//    }

    public String getCurrentWeather(Coordinates p_coordinates) {
        int coordinates = p_coordinates.getHeight() + p_coordinates.getLatitude() + p_coordinates.getLongitude();
        return weather[coordinates % 4];
    }
}
