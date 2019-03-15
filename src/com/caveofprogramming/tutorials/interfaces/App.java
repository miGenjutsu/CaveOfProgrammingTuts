package com.caveofprogramming.tutorials.interfaces;

public class App {
    public static void main(String[] args) {
        Machine machine = new Machine();

        machine.start();

        Person person = new Person("Bob");
        person.greet();

        //Using an Interface
        Info info = new Machine();
        info.showInfo();

        Info info1 = person;
        info1.showInfo();
    }
}
