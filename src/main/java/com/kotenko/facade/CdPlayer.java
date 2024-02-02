package com.kotenko.facade;

public class CdPlayer {
    public void on() {
        System.out.println("CdPlayer on");
    }

    public void play(String movie) {
        System.out.println("CdPlayer play");
    }

    public void stop() {
        System.out.println("CdPlayer stop");
    }

    public void reject() {
        System.out.println("CdPlayer reject");
    }

    public void off() {
        System.out.println("CdPlayer off");
    }
}
