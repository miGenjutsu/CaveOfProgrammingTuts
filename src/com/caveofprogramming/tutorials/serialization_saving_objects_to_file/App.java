package com.caveofprogramming.tutorials.serialization_saving_objects_to_file;

import java.io.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Writing Objects...");

        Person naruto = new Person(654, "Naruto");
        Person sasuke = new Person(321, "Sasuke");

        try (FileOutputStream fileOutputStream = new FileOutputStream("person.bin")) {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(naruto);
            objectOutputStream.writeObject(sasuke);

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


//TODO:
// sout "Writing Objects"
// create a try/cath for FileOutputStream
// inside try: create an 'object output stream' and pass 'file output stream' as argument
// handle all catch exceptions. (for now just print out 'stack trace')