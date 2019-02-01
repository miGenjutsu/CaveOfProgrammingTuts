//Continuation from "classObjectsPractice"

class Robot {
    void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " +height);
    }

    public void move(String direction, double distance){
        System.out.print("Moving: " +distance + " meters");
        System.out.println(" In direction: " +direction);
    }
}

public class MethodsPracticeMain {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        Robot android = new Robot();

        android.speak("Hello, there");  /*ihave passed 'text' when declaring the method. this is that example*/
        android.jump(2);
        android.move("west", 12.2);

        String greeting = "Hi, there.";  /*creating a placeholder for an expected String when calling "android.speak()"*/
        android.speak(greeting);    /*now using 'greeting' as a new String placeholder instead of what idid on line '24'*/

        int value = 14;
        android.jump(value);    /*same example as above but for integers*/
    }
}
