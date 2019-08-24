package src.com.caveofprogramming.tutorials.multiple_exceptions;

import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args)  {

        Test test = new Test();

        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
         */

        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }
}
