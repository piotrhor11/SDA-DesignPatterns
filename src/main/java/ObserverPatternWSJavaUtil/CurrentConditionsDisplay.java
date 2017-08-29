package ObserverPatternWSJavaUtil;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, IDisplay {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable dataSource;

    public CurrentConditionsDisplay(Observable dataSource) {
        this.dataSource = dataSource;
        dataSource.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Obecne warunki:\n Temperatura: %.1f stC\n Wilgotność: %.1f %%\n Ciśnienie: %.1f hPA\n", temperature, humidity, pressure);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData stacja = (WeatherData) obs;
            this.temperature = stacja.getTemp();
            this.humidity = stacja.getHumidity();
            this.pressure = stacja.getPreassure();
            display();
        }
    }
}
