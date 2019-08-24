package src.com.caveofprogramming.tutorials.handling_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
//  First type of Exception.
//        File file = new File("test.txt");
//
//        FileReader fr = new FileReader(file);

//  Second type of Exception.
//        System.out.println("some code here.");
//
//        File file = new File("test.txt");
//
//        try {
//            FileReader fr = new FileReader(file);
//
//            // This will not be executed if an exception is thrown.
//            System.out.println("Continuing....");
//        } catch (FileNotFoundException e) {
//            System.out.println("file not found: "+file.toString());
////            e.printStackTrace();
//        }
//        System.out.println("...Finished");


        try {
            openFile();
        } catch (FileNotFoundException e) {
            // PS. this message is too vague.
            System.out.println("Could not open file");
        }

    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");

        FileReader fileReader = new FileReader(file);
    }
}