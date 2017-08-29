package ObserverPatternWSJavaUtil;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temp;
    private float humidity;
    private float preassure;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPreassure() {
        return preassure;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float preassure) {
        this.temp = temp;
        this.humidity = humidity;
        this.preassure = preassure;
        measurementsChanged();
    }
}
