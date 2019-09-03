package src.com.caveofprogramming.tutorials.try_with_resources;

import java.io.*;

public class AppTwo {
    public static void main(String[] args) {
        File file = new File("test.txt");


        // a better way to write this block of code, compared to "reading file with file reader" tutorial
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(file)) ) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file "+file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file "+file.toString());
        }
    }
}
