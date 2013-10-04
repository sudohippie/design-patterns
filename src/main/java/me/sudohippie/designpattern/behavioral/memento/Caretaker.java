package me.sudohippie.designpattern.behavioral.memento;

import java.util.Stack;

/**
 * The caretaker class which captures Mementos of a system. It uses
 * these mementos to restore a system to a particular state.
 *
 * Raghav Sidhanti
 * 10/4/13
 */
public class Caretaker {

    private WeatherService weatherService;

    public Caretaker(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    private Stack<Memento> stack = new Stack<>();

    public void takeCare(){
        // request the status of the service
        for(int i = 0; i <= 8; i ++){
            String state = weatherService.getSystemStatus();
            System.out.println(state);

            // if the system is running, save the state of the system
            if(state.equals(WeatherService.RUNNING)){
                stack.push(weatherService.saveAndReturnMemento());
            }else {
                // if the system is not running, reload the system with one of the saved states.
                stack.pop();
                stack.pop();

                weatherService.loadFromMemento(stack.pop());
            }
        }
    }
}
