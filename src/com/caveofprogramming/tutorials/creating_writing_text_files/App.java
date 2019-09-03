package src.com.caveofprogramming.tutorials.creating_writing_text_files;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("src/com/caveofprogramming/tutorials/creating_writing_text_files/test.txt");


        // a better way to write this block of code, compared to "reading file with file reader" tutorial
        try ( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)) ) {
            bufferedWriter.write("This is line ONE");
            bufferedWriter.newLine();
            bufferedWriter.write("This is line TWO");
            bufferedWriter.newLine();
            bufferedWriter.write("This is line THREE");
            bufferedWriter.newLine();
            bufferedWriter.write("Last line.");
        } catch (IOException e) {
            System.out.println("Unable to read file "+file.toString());
        }
    }
}
