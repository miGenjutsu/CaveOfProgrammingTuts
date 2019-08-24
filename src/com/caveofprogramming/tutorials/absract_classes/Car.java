package src.com.caveofprogramming.tutorials.absract_classes;

public class Car extends Machine {
    @Override
    void start() {
        System.out.println("Car starting...");
    }

    @Override
    void doStuff() {
        System.out.println("Turning on wipers...");
    }

    @Override
    void shutDown() {
        System.out.println("Turning off car...");
    }
}
