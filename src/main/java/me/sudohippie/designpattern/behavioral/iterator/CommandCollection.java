package me.sudohippie.designpattern.behavioral.iterator;

import java.util.Arrays;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class CommandCollection implements Iterable {
    public static String[] commands = {"temperature", "humidity", "pressure", "windspeed", "clouds"};

    public void print(){
        System.out.println(Arrays.toString(commands));
    }

    private class IteratorImpl implements Iterator {

        private int position = 0;

        @Override
        public boolean hasNext() {
            return (position < commands.length);
        }

        @Override
        public String next() {
            return commands[position ++];
        }
    }

    @Override
    public Iterator createIterator() {
        return new IteratorImpl();
    }
}
