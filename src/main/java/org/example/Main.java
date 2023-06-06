package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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


        //第4課題追加
        //reversOrderと複数項目のソート
        Stream.of(448,155,59,923,330,133).sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add (new Pokemon (46,448, "Lucario"));
        pokemonList.add (new Pokemon (5,155, "Cyndaquil"));
        pokemonList.add (new Pokemon (25,59, "Arcanine"));
        pokemonList.add (new Pokemon (25,923, "Pawmot"));
        pokemonList.add (new Pokemon (36,330, "Flygon"));
        pokemonList.add (new Pokemon (5,133, "Eevee"));

        pokemonList.stream().sorted(Comparator.comparing(Pokemon::getLv).reversed()
                        .thenComparing(Pokemon::getNo))
                .toList().forEach(System.out::println);

    }
}