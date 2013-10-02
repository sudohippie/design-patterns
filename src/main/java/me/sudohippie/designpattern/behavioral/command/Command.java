package me.sudohippie.designpattern.behavioral.command;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public abstract class Command {

    protected WeatherReceiver weatherReceiver;

    public Command(WeatherReceiver weatherReceiver) {
        this.weatherReceiver = weatherReceiver;
    }

    public abstract void execute();
}
