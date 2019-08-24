package src.com.caveofprogramming.tutorials.absract_classes;

public class Camera extends Machine {
    @Override
    void start() {
        System.out.println("Camera starting...");
    }

    @Override
    void doStuff() {
        System.out.println("Taking photo...");
    }

    @Override
    void shutDown() {
        System.out.println("Shutting down...");
    }
}
