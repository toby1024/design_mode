package java_observer;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer {
    private Observable observable;
    private float temperature;

    public GeneralDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    public void display(){
        System.out.println("general===>temperature:" + temperature);
    }
}
