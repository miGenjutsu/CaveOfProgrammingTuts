package src.com.caveofprogramming.tutorials.reading_files_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "E:\\CloudLogixTech\\Documents\\DesktopFoloder\\Udemy-Courses\\java-cave-of-programming-tutorials\\CaveOfProgrammingTuts\\src\\com\\caveofprogramming\\tutorials\\reading_files_scanner\\example.txt";

        File textFile = new File(fileName);

        Scanner scanner = new Scanner(textFile);
        int value = scanner.nextInt();
        System.out.println("Read value: "+value);

        scanner.nextLine();

        int count = 2;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            System.out.println(count+": "+line);
            count++;
        }
        scanner.close();
    }
}
