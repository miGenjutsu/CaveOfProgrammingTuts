package com.caveofprogramming.tutorials.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); /*--> use for add/remove items at end of list*/
        LinkedList<Integer> linkedList = new LinkedList<>(); /*--> use for add/remove items any where else*/

        System.out.println("HELLO");
//      List<Integer> arrayList = new ArrayList<>(); --> another way of calling above
//      List<Integer> linkedList = new LinkedList<>(); --> another way of calling above
    }

    private static void doTiming(String type, LinkedList<Integer> list) {
        for (int i=0; i<1E5; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " +(end - start) + " ms for "+type);
    }
}
