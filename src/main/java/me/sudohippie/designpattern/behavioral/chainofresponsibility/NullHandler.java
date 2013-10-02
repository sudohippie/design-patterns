package me.sudohippie.designpattern.behavioral.chainofresponsibility;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class NullHandler extends Handler {
    protected NullHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Command command) {
        System.out.println(command.getDescription() + " UNKNOWN");
    }

    @Override
    protected String getHandlerName() {
        return "null";
    }
}
