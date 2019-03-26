package com.caveofprogramming.tutorials.upcasting_downcasting;

import com.caveofprogramming.tutorials.inheritance_tutorial.Machine;

import javax.crypto.Mac;

class Maching {
    public void start() {
        System.out.println("Machine started...");
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started...");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}


public class App {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Camera camera = new Camera();

        machine.start();
        camera.start();
        camera.snap();

        //Upcasting
        Machine machine1 = new Camera();
//        Machine machine1 = camera; <-- or you could do that
        machine1.start();
        ((Camera) machine1).snap();


        //Downcasting
        Machine machine2 = new Camera();
        Camera camera1 = (Camera) machine2;
        camera1.start();
        camera1.snap();

        // Doesn't work --- runtime error
        Machine machine3 = new Machine();
        Camera camera2 = new Camera();
//        camera2.start();
//        camera2.snap();
    }
}
