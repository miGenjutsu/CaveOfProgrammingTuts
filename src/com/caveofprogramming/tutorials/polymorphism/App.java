package com.caveofprogramming.tutorials.polymorphism;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        Tree tree = new Tree();

        Plant plant1 = tree;

        plant1.grow();

        tree.shedLeave();

        ((Tree) plant1).shedLeave();

        doGrow(tree);
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
