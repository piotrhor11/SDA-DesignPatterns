package ObserverPatternWeatherStation;

public interface IObserver {

    void update(float temp, float humidity, float preassure);

}
