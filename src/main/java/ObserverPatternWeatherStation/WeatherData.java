package ObserverPatternWeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

    List<IObserver> observers;
    private float temp;
    private float humidity;
    private float preassure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float preassure) {
        this.temp = temp;
        this.humidity = humidity;
        this.preassure = preassure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (IObserver observer : observers) {
            observer.update(temp, humidity, preassure);
        }
    }
}
