package com.kotenko.command.devices;

public class Light {
    private String place;
    public Light(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println("Light On in " + place);
    }

    public void off() {
        System.out.println("Light Of " + place);
    }
}
