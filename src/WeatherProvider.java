public class WeatherProvider extends Tower {

    private static WeatherProvider provider = null;

    public static synchronized WeatherProvider getWeatherProvider() {
        if (provider == null) {
            provider = new WeatherProvider();
        }
        return provider;
    }

    private String[] weather;

    private WeatherProvider() {

    }
    //public String getCurrentWeather(Coordiates p_coordibates){

    //}
}
