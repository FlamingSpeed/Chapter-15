package org.kevin.hillcrest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.addFirst("Alex");
        names.addFirst("Om");
        names.add("Ericka");
        names.add("Will");
        names.addFirst("Marla");
        names.removeFirst();
        names.removeLast();
        names.add("Matus");
        names.addFirst("Kushal");

        ListIterator<String> iterator = names.listIterator();
        while(iterator.hasNext()){
            var name = iterator.next();
            if(name.equals("Om")){
                iterator.remove();
                iterator.next();
                iterator.remove();
                //Can't call remove twice in a row or you will get an error
            }if(name.equals("Ericka")){
                iterator.add("Peter");
            }
        }
        for (var name : names){
            System.out.println(name);
        }
    }
}
