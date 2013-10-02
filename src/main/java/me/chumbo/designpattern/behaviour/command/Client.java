package me.chumbo.designpattern.behaviour.command;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class Client {
    /*
    In the command pattern, you can create commands to which you provide
    a service you wish to invoke, this is the receiver of the command/endpoint.

    The command is then passed to a centralized invoker which will manage all
    command executions.

    This pattern frees the client from invocation and provides asynchronous communication
    with services when necessary.
     */
    public static void main(String[] args){
        WeatherReceiver service = new WeatherReceiver();
        Command temperature = new TemperatureCommand(service);
        Command humidity = new HumidityCommand(service);

        WeatherInvoker agent = new WeatherInvoker();
        agent.request(temperature);
        agent.request(humidity);
    }
}
