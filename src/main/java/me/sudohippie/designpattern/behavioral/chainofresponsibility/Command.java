package me.sudohippie.designpattern.behavioral.chainofresponsibility;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class Command {
    private String description;
    private String type;

    public Command(String description, String type) {
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
}
