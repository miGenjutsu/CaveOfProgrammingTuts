package com.caveofprogramming.tutorials.toString;

class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
//        return String.format("%d: %s", id, name);
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(id)
                .append(": ")
                .append(name);
        return stringBuilder.toString();
    }
}

public class ToStringMain {
    public static void main(String[] args) {
        Frog frog = new Frog(0, "Freddy");
        Frog frog1 = new Frog(1, "Roger");

        System.out.println(frog.toString());
        System.out.println(frog1.toString());
    }
}


//TODO:
// //METHODS:: Frog() -> toString(), int id, string name
// OUTPUT::
//        1: Freddy
//        2: Roger
// frog names freddy, roger