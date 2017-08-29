package ObserverPatternWeatherStation;

public class CurrentConditionsDisplay implements IObserver, IDisplay {

    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject dataSource;

    public CurrentConditionsDisplay(ISubject dataSource) {
        this.dataSource = dataSource;
        dataSource.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Obecne warunki:\n Temperatura: %.1f stC\n Wilgotność: %.1f %%\n Ciśnienie: %.1f hPA\n", temperature, humidity, pressure);
    }

    @Override
    public void update(float temp, float humidity, float preassure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = preassure;
        display();
    }
}
