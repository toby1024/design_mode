package observer;

public class WatchDisplay implements Observer, Display {

    private Subject subject;
    private float temperature;

    public WatchDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("watch====>temperature:" + temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }
}
