package com.kotenko.facade;

public class HomeTheatreTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amp, tuner, cd, projector, lights, screen, popper);
        homeTheatreFacade.watchMovie("Movie");
        homeTheatreFacade.endMovie();
    }
}
