package com.caveofprogramming.tutorials.serialization_saving_objects_to_file;

import java.io.*;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try (FileInputStream fileInputStream = new FileInputStream("people.bin")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person)objectInputStream.readObject();
            Person person2 = (Person)objectInputStream.readObject();

            objectInputStream.close();

            System.out.println(person1);
            System.out.println(person2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


//TODO:
// sout "reading objects"
// create a try/cath for FileInputStream
// inside try: create an 'object input stream' and pass 'file input stream' as argument
// handle all catch exceptions. (for now just print out 'stack trace')