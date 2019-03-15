package com.caveofprogramming.tutorials.inheritance_tutorial;

public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Car start...");
    }

    public void wipeWindshield() {
        System.out.println("Wiping windshield...");
    }

    public void showInfo() {
        System.out.println("Car name: "+name);
    }
}
