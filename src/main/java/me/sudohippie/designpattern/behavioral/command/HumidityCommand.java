package me.sudohippie.designpattern.behavioral.command;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class HumidityCommand extends Command{

    public HumidityCommand(WeatherReceiver weatherReceiver) {
        super(weatherReceiver);
    }

    @Override
    public void execute() {
        weatherReceiver.printHumidity();
    }
}
