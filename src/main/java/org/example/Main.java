package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("Poke Ball", "Potion", "Repel", "Oran Berry"));
        items.add("Great Ball");
        items.add("Super Potion");
        items.add("Shell Bell");
        items.add("Oran Berry");
        items.add("Sitrus Berry");
        items.add("Ultra Ball");
        items.add("Oran Berry");
        items.add("Rare Candy");
        items.add("Master Ball");


        List<String> sortItems = items.stream().sorted().toList();
        System.out.println(sortItems);



        items.stream().filter( ball -> ball.contains("Ball")).forEach(System.out::println);


        boolean hasOran = items.stream().anyMatch( oran -> oran.equals("Oran Berry"));

        if(hasOran) {
            var countOran = items.stream().filter(rope -> rope.equals("Oran Berry")).count();
            System.out.println(countOran + " Oran Berry left");
        } else {
            System.out.println("Do not have");
        }
    }
}