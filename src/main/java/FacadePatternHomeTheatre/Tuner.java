package FacadePatternHomeTheatre;

public class Tuner implements IDevice {
    @Override
    public void on() {
        System.out.println("Tuner TV ON");
    }

    @Override
    public void off() {
        System.out.println("Tuner TV OFF");
    }
}
