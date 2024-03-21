package org.kevin.hillcrest;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Veeranshu");
        names.add("Veeranshu");
        //Can only add it once
        names.add("Sidharth");
        names.remove("Veeranshu");

        for(var name: names){
            System.out.println(name);
        }
    }
}
