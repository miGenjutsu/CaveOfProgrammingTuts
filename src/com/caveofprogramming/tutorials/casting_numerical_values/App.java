package com.caveofprogramming.tutorials.casting_numerical_values;

public class App {
    public static void main(String[] args) {
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = (float) 8834.8f;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;
        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int) floatValue;
        System.out.println(intValue);


        // The following wont work as we expect it to!!
        // 128 is too big for a byte
        byte byteValue = (byte)128;
        System.out.println(byteValue);
    }
}
