package src.com.caveofprogramming.tutorials.anonymous_classes;

class Machine {
    public void start() {
        System.out.println("Starting Machine.");
    }
}

interface Plant {
    void grow();
}

public class App {
    public static void main(String[] args) {
        Machine machine = new Machine(){
            //an example of an anonymous class
            @Override
            public void start() {
                System.out.println("Camera snapping ......");
            }
        };

        machine.start();

        Plant plant = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant grows...");
            }
        };

        plant.grow();
    }
}
