package com.caveofprogramming.tutorials.toString;

class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(id)
                .append(": ")
                .append(name);
        return stringBuilder.toString();
    }
}

public class ToStringMain {
    public static void main(String[] args) {
        Frog frog = new Frog(1, "Freddy");
        Frog frog1 = new Frog(2, "Roger");

        System.out.println(frog);
        System.out.println(frog1);
    }
}


//TODO:
// OUTPUT::
//        1: Freddy
//        2: Roger
// frog names freddy, roger