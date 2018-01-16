package observer;

public class CurrentConditionsDisplay implements Display, Observer {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject subject){
        this.weatherData = subject;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("currentCondition====>temperature: " + temperature + ";humidity:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}