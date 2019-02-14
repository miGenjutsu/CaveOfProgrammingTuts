package com.caveofprogramming.tutorials.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

//        map.put(6, "Hello"); --> second 'put' will just override previous key

        String text = map.get(6);
//      String text = map.get(1); --> returns 'null' since ihvnt declared a "1"

        System.out.println(text);

        for (Map.Entry<Integer, String > entry : map.entrySet()) {
            /*System.out.println(entry);*/
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": "+value);
        }

    }
}
