package com.kotenko.facade;

public class HomeTheatreFacade {
    Amplifier amp;
    Tuner tuner;

    CdPlayer cd;

    Projector projector;

    TheaterLights lights;

    Screen screen;

    PopcornPopper popper;

    public HomeTheatreFacade(Amplifier amp,
                             Tuner tuner,
                             CdPlayer cd,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd();
        amp.setSurroundSound();
        amp.setVolume(5);
        cd.on();
        cd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theatre down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        cd.stop();
        cd.reject();
        cd.off();
    }
}
