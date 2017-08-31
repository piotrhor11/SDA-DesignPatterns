package FacadePatternHomeTheatre;

public class HomeTheatreFacade {

    private Amplifier amp;
    private DVDPlayer dvdPlayer;
    private TvScreen tvScreen;
    private ThermoMix thermoMix;
    private String movie;

    public HomeTheatreFacade(Amplifier amp, DVDPlayer dvdPlayer, TvScreen tvScreen, ThermoMix thermoMix, String movie) {

        this.amp = amp;
        this.dvdPlayer = dvdPlayer;
        this.tvScreen = tvScreen;
        this.thermoMix = thermoMix;
        this.movie = movie;
    }

    public void watchMovie() {
        amp.on();
        amp.setInput(dvdPlayer);
        amp.setAudio(5);
        dvdPlayer.on();
        dvdPlayer.set(movie);
        tvScreen.on();
        thermoMix.on();
        thermoMix.doMeal();
        dvdPlayer.play();
    }

    public void endMovie() {

    }

}
