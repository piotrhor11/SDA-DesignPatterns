package ObserverPatternWSJavaUtil;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WeatherData stacyjka = new WeatherData();
        CurrentConditionsDisplay wyswietlacz = new CurrentConditionsDisplay(stacyjka);
        stacyjka.setMeasurements(23.4f, 45, 1016);
        Thread.sleep(5000);
        stacyjka.setMeasurements(19.7f, 55, 1002);
        Thread.sleep(5000);
        stacyjka.setMeasurements(20.3f, 60, 1010);

    }
}
