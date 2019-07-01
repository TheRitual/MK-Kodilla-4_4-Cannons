package com.kodilla;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cannon> cannons = new LinkedList<>();
        for(int i = 0; i < 5 ; i++) {
            cannons.add(new Cannon());
        }

        for (Cannon c : cannons) {
            c.fire();
        }

        for (Cannon c : cannons) {
            c.fire();
        }
    }
}
