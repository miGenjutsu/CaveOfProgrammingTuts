package src.com.caveofprogramming.tutorials.reading_with_file_reader;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("tests.txt");

        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line=bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println(line);

        } catch (FileNotFoundException e) {
            System.out.println("File not Found: "+file.toString());;
        } catch (IOException e) {
            System.out.println("Unable to read file: " +file.toString());
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Unable to close file: "+file.toString());
        } catch (NullPointerException x) {
            // File was probably never opened!
        }
    }
}
