package com.caveofprogramming.tutorials.PublicPrivateProtected;

/*
 * private --- only within same class
 * public ---- from anywhere
 * protected ---- same class, subclass, and same package
 * no modifier ---- same package only
 */

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);

        // Won't work --- type is 'private
        // System.out.println(plant.type);
    }
}
