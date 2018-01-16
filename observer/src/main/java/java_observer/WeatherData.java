package java_observer;

import java.util.HashMap;
import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void pushChanged() {
        setChanged();
        HashMap<String, Float> data = new HashMap<>();
        data.put("temperature", temperature);
        data.put("humidity", humidity);
        data.put("pressure", pressure);
        notifyObservers(data);
    }

    // 模拟数据变化
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 模拟数据变化, push 数据
    public void setMeasurementsAndPush(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        pushChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
