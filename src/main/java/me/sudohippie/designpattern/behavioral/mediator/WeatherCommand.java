package me.sudohippie.designpattern.behavioral.mediator;

/**
 * A command representing a request for a specific
 * weather attribute.
 *
 * Raghav Sidhanti
 * 10/3/13
 */
public abstract class WeatherCommand {

    /**
     * A String representation of this weather command.
     *
     * @return
     */
    public String getCommandType(){
        return this.getClass().getSimpleName();
    }
}
