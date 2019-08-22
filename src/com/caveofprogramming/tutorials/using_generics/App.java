package src.com.caveofprogramming.tutorials.using_generics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class App {
    public static void main(String[] args) {

        // Before Java 5 //
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(2);

        System.out.println(fruit);


        // Modern Style //
        //NOTE:: because i specified <"'String'>" i do not have to downcast when calling the .get()
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);

        // There can be more then one type argument //

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //// JAVA 7 style ////
        ArrayList<Animal> someList = new ArrayList<>();

    }
}
