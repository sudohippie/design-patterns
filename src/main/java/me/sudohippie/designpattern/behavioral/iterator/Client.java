package me.sudohippie.designpattern.behavioral.iterator;

/**
 * Raghav Sidhanti
 * 9/13/13
 */
public class Client {
    public static void main(String[] args){
        CommandCollection collection = new CommandCollection();
        Iterator iterator = collection.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
