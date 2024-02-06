package com.kotenko.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); //Subject
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData); //Observer
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
