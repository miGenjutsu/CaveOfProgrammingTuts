package com.caveofprogramming.tutorials.inheritance_tutorial;

public class InheritanceMain {
    public static void main(String[] args) {
        Machine machine = new Machine();

        machine.start();
        machine.stop();

        Car car = new Car();

        car.start();
        car.showInfo();
        car.wipeWindshield();
        car.stop();
    }
}

//TODO:
// OUTPUT::
//        Machine started...
//        Machine stopped...
//        Car started...
//        Car name: Machine Type 1
//        Wiping windshield...
//        Machine stopped...
// METHODS::
//        Machine: start(), stop(), name
//        Car: wipeWindshield(), showInfo(get from machine), override of start()