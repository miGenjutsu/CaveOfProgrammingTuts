package com.caveofprogramming.tutorials.interfaces;

import javax.crypto.Mac;

public class App {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.start();

        Person person = new Person("Zelda");
        person.greet();

        Info info = new Machine();
        info.showInfo();

        Info info1 = person;
        info1.showInfo();

        System.out.println();

        outputInfo(machine);
        outputInfo(person);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}

//TODO:
// OUTPUT::
//        Machine started
//        Hello there.
//        Machine ID is: 7
//        Person name is: Bob
// METODS::
// Machine: int id=7, start()
// Person: string name, greet()
// Main:
