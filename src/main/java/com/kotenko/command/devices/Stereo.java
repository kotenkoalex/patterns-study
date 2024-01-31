package com.kotenko.command.devices;

public class Stereo {
    private String place;
    public Stereo(String place) {
        this.place = place;
    }

    public void on(){
        System.out.println("Stereo on in place: " + place);
    }

    public void off(){
        System.out.println("Stereo off: " + place);
    }

    public void setCd(){
        System.out.println("Stereo setCd");
    }

    public void setDvd(){
        System.out.println("Stereo setDvd");
    }

    public void setRadio(){
        System.out.println("Stereo setRadio");
    }

    public void setVolume(int volume){
        System.out.println("Stereo setVolume size: " + volume);
    }
}
