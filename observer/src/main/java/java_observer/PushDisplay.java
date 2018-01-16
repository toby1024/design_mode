package java_observer;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

public class PushDisplay implements Observer {

    private Observable observable;
    private float temperature;
    private float humidity;

    public PushDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            if (null != arg) {
                HashMap data = (HashMap) arg;
                this.temperature = (float) data.get("temperature");
                this.humidity = (float) data.get("humidity");
                display();
            }
        }
    }

    public void display() {
        System.out.println("push===>temperature:" + temperature + ";humidity:" + humidity);
    }
}
