package com.caveofprogramming.tutorials.polymorphism;

public class Tree extends Plant {
    @Override
    public void grow() {
        System.out.println("Tree growing...");
    }

    public void shedLeave() {
        System.out.println("Shedding leaves...");
    }
}
