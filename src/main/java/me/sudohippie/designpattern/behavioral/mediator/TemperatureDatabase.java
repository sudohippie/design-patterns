package me.sudohippie.designpattern.behavioral.mediator;

/**
 * Database holding temperature information
 *
 * Raghav Sidhanti
 * 10/3/13
 */
public class TemperatureDatabase extends WeatherDatabase {
    @Override
    public String getCurrentCondition() {
        return "69F";
    }
}
