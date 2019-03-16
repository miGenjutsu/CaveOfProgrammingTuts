package com.caveofprogramming.tutorials.interfaces;

import javax.crypto.Mac;

public class App {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.start();

        Info info = machine;
        info.showInfo();

        System.out.println();

        Person person = new Person("Link");
        person.greet();

        Info info1 = person;
        person.showInfo();

        System.out.println();

//      using a created method
        outputInfo(machine);
        outputInfo(person);

    }

    public static void outputInfo(Info info) {
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
// Main: outputInfo(Info info)
// Info: showInfo()
