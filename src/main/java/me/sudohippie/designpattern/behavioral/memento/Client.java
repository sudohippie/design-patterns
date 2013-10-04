package me.sudohippie.designpattern.behavioral.memento;

/**
 * Raghav Sidhanti
 * 10/4/13
 */
public class Client {
    public static void main(String[] args){
        WeatherService service = new WeatherService();
        Caretaker caretaker = new Caretaker(service);

        caretaker.takeCare();
    }
}
