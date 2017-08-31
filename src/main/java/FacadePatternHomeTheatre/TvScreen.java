package FacadePatternHomeTheatre;

public class TvScreen implements IDevice {
    @Override
    public void on() {
        System.out.println("TV screen ON");
    }

    @Override
    public void off() {
        System.out.println("TV screen OFF");
    }
}
