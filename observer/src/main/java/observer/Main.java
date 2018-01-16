package observer;

public class Main {
    public static void main(String[] args) {

        WeatherData s = new WeatherData();
        CurrentConditionsDisplay c = new CurrentConditionsDisplay(s);
        WatchDisplay w = new WatchDisplay(s);

        s.setMeasurements(10,30, 30);
    }
}
