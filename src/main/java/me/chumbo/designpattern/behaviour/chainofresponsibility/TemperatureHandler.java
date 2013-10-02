package me.chumbo.designpattern.behaviour.chainofresponsibility;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class TemperatureHandler extends Handler{
    protected TemperatureHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Command command) {
        if(command.getType().equals(getHandlerName())){
            System.out.println(command.getDescription() +" 75 F");
        }else {
            getNextHandler().handle(command);
        }
    }

    @Override
    protected String getHandlerName() {
        return "temperature";
    }
}
