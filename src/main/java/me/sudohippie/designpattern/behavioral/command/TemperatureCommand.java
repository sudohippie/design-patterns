package me.sudohippie.designpattern.behavioral.command;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class TemperatureCommand extends Command {

    public TemperatureCommand(WeatherReceiver weatherReceiver) {
        super(weatherReceiver);
    }

    @Override
    public void execute() {
        weatherReceiver.printTemperature();
    }
}
