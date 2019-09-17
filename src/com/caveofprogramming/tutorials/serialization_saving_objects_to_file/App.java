package com.caveofprogramming.tutorials.serialization_saving_objects_to_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person naruto = new Person(543, "Naruto");
        Person sasuke = new Person(123, "Sasuke");

        System.out.println(naruto);
        System.out.println(sasuke);


        try(FileOutputStream fileOutputStream = new FileOutputStream("people.bin")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(naruto);
            objectOutputStream.writeObject(sasuke);

            objectOutputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
