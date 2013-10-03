package me.sudohippie.designpattern.behavioral.mediator;

/**
 * Database holding humidity information
 *
 * Raghav Sidhanti
 * 10/3/13
 */
public class HumidityDatabase extends WeatherDatabase {
    @Override
    public String getCurrentCondition() {
        return "43%";
    }
}
