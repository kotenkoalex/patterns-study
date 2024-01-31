package com.kotenko.command.devices;

public class GarageDoor {
    private String place;
    public GarageDoor(String place) {
        this.place = place;
    }

    public void up() {
        System.out.println("GarageDoor up");
    }

    public void down() {
        System.out.println("GarageDoor down");
    }

    public void stop() {
        System.out.println("GarageDoor stop");
    }

    public void lightOn() {
        System.out.println("GarageDoor lightOn");
    }

    public void lightOff() {
        System.out.println("GarageDoor lightOff");
    }
}
