package me.sudohippie.designpattern.behavioral.mediator;

import java.util.Hashtable;
import java.util.Map;

/**
 * Mediator class which maps peers together providing a level of
 * indirection.
 *
 * Raghav Sidhanti
 * 10/3/13
 */
public class WeatherMediator {
    private final Map<String, WeatherDatabase> map;

    public WeatherMediator() {
        this.map = new Hashtable<>();
        map.put(new TemperatureCommand().getCommandType(), new TemperatureDatabase());
        map.put(new HumidityCommand().getCommandType(), new HumidityDatabase());
    }

    /**
     * This method co-ordinates interaction between the weather commands and databases.
     * This method then returns the requested data for the command argument.
     *
     * @param command
     * @return
     */
    public String getCondition(WeatherCommand command){
        WeatherDatabase database = map.get(command.getCommandType());
        return database.getCurrentCondition();
    }
}
