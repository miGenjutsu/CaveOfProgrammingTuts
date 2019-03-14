package com.caveofprogramming.tutorials.string_builder_string_formatting;

public class StringBuilderFormatting {
    public static void main(String[] args) {

        // Inefficient.
        String info = "";

        info += "My name is Dom.";
        info += " ";
        info += "I'am a programmer.";

        System.out.println(info);

        // More efficient.
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Brendt");
        sb.append(" ");
        sb.append("I'am a senior developer.");

        System.out.println(sb.toString());

        // More efficient (shortcut)
        StringBuilder s = new StringBuilder();

        s.append("My name is Dayne.")
                .append(" ")
                .append("I'am a Senior I.T. Profession, and a Senior Developer.");

        System.out.println(s.toString());


        // Formatting //
        System.out.println("Here is some text.\tThat was a tab.\nThat was a newLine");
        System.out.println("More Text");

        // Formatting integers
        System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);

        for (int i=0; i<5; i++) {
            System.out.printf("%2d:  %s\n", i, "here is some text");
        }

        //Formatting floating point value
        System.out.printf("Total value: %.2f\n", 5.6874);
        System.out.printf("Total value: %.2f\n", 343.23423);
    }
}
