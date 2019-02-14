package com.caveofprogramming.tutorials.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        /*
        * ArrayLists manage arrays internally.
        * [0][1][2][3][4][5] ....
        * /
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        List<Integer> arrayList = new ArrayList<Integer>(); /*--> used: add/remove @ end of list*/


        /*
         *LinkedLists consists of elements where each element
         * has a reference to the previous and next element
         * [0] -> [1] -> [2] ....
         *     <-     <-
         *
         */
        List<Integer> linkedList = new LinkedList<Integer>();   /*--> used: add/remove @ beginning or middle*/

        doTiminigs("ArrayList", arrayList);
        doTiminigs("LinkedList", linkedList);
    }

    private static void doTiminigs(String type, List<Integer> list) {
        for (int i=0; i<1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

////      add items at end of list
//        for (int i=0; i<1E5; i++) {
//            list.add(i);
//        }

//      add items elsewhere in list
        for (int i=0; i<1E5; i++) {
            list.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time Taken: "+(end - start)+ " ms for "+type);
    }
}
