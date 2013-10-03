package me.sudohippie.designpattern.behavioral.mediator;

/**
 * Main class which facilitates interaction between class via
 * the mediator.
 *
 * Raghav Sidhanti
 * 10/3/13
 */
public class Client {
    public static void main(String[] args){
        // create the mediator
        WeatherMediator mediator = new WeatherMediator();

        // weather information you want to know
        TemperatureCommand temperatureCommand = new TemperatureCommand();
        HumidityCommand humidityCommand = new HumidityCommand();

        // request for current conditions
        String currentTemperature = mediator.getCondition(temperatureCommand);
        String currentHumidity = mediator.getCondition(humidityCommand);

        System.out.println(currentTemperature);
        System.out.println(currentHumidity);
    }
}
