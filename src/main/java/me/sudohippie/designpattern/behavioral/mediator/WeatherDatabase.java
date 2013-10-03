package me.sudohippie.designpattern.behavioral.mediator;

/**
 * A weather database that holds weather information.
 *
 * Raghav Sidhanti
 * 10/3/13
 */
public abstract class WeatherDatabase {

    /**
     * Returns the current conditions from the weather
     * station.
     *
     * @return
     */
    public abstract String getCurrentCondition();
}
