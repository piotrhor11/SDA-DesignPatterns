package FacadePatternHomeTheatre;

public class ThermoMix implements IDevice {
    @Override
    public void on() {
        System.out.println("ThermoMix ON");
    }

    @Override
    public void off() {
        System.out.println("ThermoMix OFF");
    }

    public void doMeal() {
        System.out.println("Preparing food");
    }
}
