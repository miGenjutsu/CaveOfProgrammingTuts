package com.caveofprogramming.tutorials.PublicPrivateProtected;

public class Plant {
    // Bad Practice (shouldn't be 'public'
    public String name;

    // Acceptable Practice --- it's 'final'
    public final static int ID = 8;

    private String type;

    protected String size;


    public Plant() {
        name = "Sunflower";
        type = "plant";


        this.size = "medium";
    }

}
