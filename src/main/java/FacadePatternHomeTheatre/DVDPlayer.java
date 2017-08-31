package FacadePatternHomeTheatre;

public class DVDPlayer implements IDevice, IPlayable {

    String movieTitle;

    @Override
    public void on() {
        System.out.println("DVD Player ON");
    }

    @Override
    public void off() {
        System.out.println("DVD Player OFF");
    }

    @Override
    public void set(String title) {
        this.movieTitle = title;
    }

    @Override
    public void play() {
        System.out.printf("Play Movie %s.", movieTitle);
    }

    @Override
    public void stop() {

    }
}
