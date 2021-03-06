package me.sudohippie.designpattern.behavioral.command;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class WeatherInvoker {

    /*
    The agent can maintain state.

    For example, the agent may have a queue to queue all the
    commands as they are requested. And asynchronously execute
    the command.

     */

    public void request(Command command){
        command.execute();
    }
}
