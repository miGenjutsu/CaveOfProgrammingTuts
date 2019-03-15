package com.caveofprogramming.tutorials.inheritance_tutorial;

public class InheritanceMain {
    public static void main(String[] args) {
       Machine machine = new Machine();

       machine.start();
       machine.stop();

        System.out.println();

       Car car = new Car();
       car.start();
       car.showInfo();
       car.wipeWindshield();
       car.stop();
    }
}
