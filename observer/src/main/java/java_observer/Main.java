package java_observer;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        GeneralDisplay g = new GeneralDisplay(w);
        PushDisplay pushDisplay = new PushDisplay(w);
        w.addObserver(pushDisplay);
        w.addObserver(g);

        w.setMeasurements(40,30, 30);
        w.setMeasurementsAndPush(30,50,60);
    }

}
