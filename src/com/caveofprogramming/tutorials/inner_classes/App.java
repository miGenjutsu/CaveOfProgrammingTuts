package src.com.caveofprogramming.tutorials.inner_classes;

public class App {
    public static void main(String[] args) {

        Robot robot = new Robot(7);

        robot.start();

//  This will only work if the Brain() method was 'public'
//        Robot.Brain brain = robot.new Brain();
//        brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();

    }
}
