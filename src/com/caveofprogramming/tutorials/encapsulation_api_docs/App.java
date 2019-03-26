package com.caveofprogramming.tutorials.encapsulation_api_docs;

class Plant {
    public static final int ID = 7;
    private String name;

    public String getData() {
        String data = "some stuf" + calculateGrowthForecase();
        return data;
    }

    private int calculateGrowthForecase() { return 9; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }
}

public class App {
    public static void main(String[] args) {

    }
}
