package Simulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunSimulation {

    WeatherProvider weatherProvider = WeatherProvider.getWeatherProvider();
    
    public void beginSimulation(int nSimulations, List<Flyable> airCrafts) {

        while (nSimulations < 0) {


            nSimulations--;
        }
    }
}
