package FacadePatternHomeTheatre;

public class Amplifier implements IDevice {

    private IPlayable input;
    private int audioLevel = 0;

    @Override
    public void on() {
        System.out.println("Amplfier ON");
    }

    @Override
    public void off() {
        System.out.println("Amplifier OFF");
    }

    public void setInput(IPlayable input) {
        this.input = input;
    }

    public void setAudio(int audioLevel) {
        this.audioLevel = audioLevel;
        System.out.printf("\nSetting audio level to %d", audioLevel);
    }
}
