package com.kodilla;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Cannon> cannons = new LinkedList<>();

        Cannon.text("Creating Cannons");
        Random gen = new Random();
        for(int i = 0; i < 5 ; i++) {
            cannons.add(new Cannon(gen.nextBoolean()));
        }

        Cannon.text("Fire cannons:");
        cannons.stream().forEach(c -> c.fire());

        Cannon.text("Cannons status:");
        cannons.stream().forEach(c -> c.status());

        Cannon.text("Loading unloaded cannons");
        cannons.stream().filter(c -> !c.isLoaded()).forEach(c -> c.loadCanon());

        Cannon.text("Cannons status:");
        cannons.stream().forEach(c -> c.status());

        Cannon.text("Fire cannons:");
        cannons.stream().forEach(c -> c.fire());

        Cannon.text("Cannons status:");
        cannons.stream().forEach(c -> c.status());

    }
}
