package com.caveofprogramming.tutorials.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        ArrayList<Integer> numbers = new ArrayList<Integer>();

//      Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        System.out.println("Getting Single Array: " + numbers.get(2));

        System.out.println("Iteration #1: ");
//      Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(+numbers.get(i));
        }

        //      this is VERY slow
        numbers.remove(0);

//      removing items(careful!)
        numbers.remove(numbers.size()-1);

        System.out.println("Iteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }

//      list interface
        List<String > values = new ArrayList<String >();

        values.add("Goku");
        values.add("Vegeta");
        values.add("Gohan");
        values.add("Trunks");

        System.out.println(values.get(0));

        for (int i=0; i<values.size(); i++){
            System.out.println(values.get(i));
        }
    }
}
