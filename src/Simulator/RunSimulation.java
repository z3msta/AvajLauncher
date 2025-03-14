package Simulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class RunSimulation {

    WeatherProvider weatherProvider = WeatherProvider.getWeatherProvider();

    public void beginSimulation(int nSimulations, WeatherTower weatherTower) {

        while (nSimulations > 0) {
            weatherTower.changeWeather();
            nSimulations--;
        }
    }
}
