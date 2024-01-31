package com.kotenko.command.devices;

public class CellingFan {
    private String place;

    public CellingFan(String place) {
        this.place = place;
    }

    public void high() {
        System.out.println("CellingFan is on high");
    }

    public void medium() {
        System.out.println("CellingFan medium is on");
    }

    public void low() {
        System.out.println("CellingFan low is on");
    }

    public void off() {
        System.out.println("CellingFan off in: " + place);
    }

    public void getSpeed() {
        System.out.println("CellingFan getSpeed");
    }
}
