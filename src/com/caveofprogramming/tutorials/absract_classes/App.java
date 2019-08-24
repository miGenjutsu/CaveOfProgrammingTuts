package src.com.caveofprogramming.tutorials.absract_classes;

public class App {
    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.setProductId(5);
        camera.run();

        System.out.println();

        Car car = new Car();
        car.setProductId(4);
        car.run();

        //Machine machine = new Machine() {}



    }
}
