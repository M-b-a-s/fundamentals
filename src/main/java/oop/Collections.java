package oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        // setDemo();
        // listDemo();
        // queueDemo();
        mapDemo();
    }
    public static void setDemo(){
        System.out.println("Set Demo");
        //Set is a collection which does not allow duplicate values
        //Set is an interface
        //Set is a subclass of Collection interface
        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("lemon");

        // System.out.println(fruit);
        // System.out.println(fruit.size());

        var i = fruit.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        for(String s: fruit) {
            System.out.println(s);
        }

        fruit.forEach(x -> System.out.println(x));
        fruit.forEach(System.out::println);
    }

    public static void listDemo(){
        System.out.println("List Demo");
        //List is a collection which allows duplicate values
        //List is an interface
        //List is a subclass of Collection interface
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("lemon");

        System.out.println(fruit);
        // System.out.println(fruit.size());

        var i = fruit.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void queueDemo(){
        System.out.println("Queue Demo");
        //Queue is a collection which allows duplicate values
        //Queue is an interface
        //Queue is a subclass of Collection interface
        Queue<String> fruit = new LinkedList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("lemon");

        System.out.println(fruit);
        // System.out.println(fruit.size());

        var i = fruit.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        for(String s: fruit) {
            System.out.println(s);
        }
    }

    public static void mapDemo(){
        System.out.println("Map Demo");
        //Map is a collection which allows duplicate values
        //Map is an interface
        //Map is a subclass of Collection interface
        Map<String, Integer> fruit = new HashMap<>();
        fruit.put("Apple", 10);
        fruit.put("Mango", 20);
        fruit.put("Orange", 30);
        fruit.put("Apple", 40);
        fruit.put("lemon", 50);


        System.out.println(fruit);

        // Iterate over the map
        for(var entry: fruit.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
