package me.sudohippie.designpattern.behavioral.chainofresponsibility;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public abstract class Handler {
    private Handler nextHandler;

    protected Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected Handler getNextHandler() {
        return nextHandler;
    }

    public abstract void handle(Command command);
    protected abstract String getHandlerName();
}
