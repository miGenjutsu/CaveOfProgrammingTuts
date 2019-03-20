package com.caveofprogramming.tutorials.PublicPrivateProtected;

public class Oak extends Plant {
    public Oak() {
        // Wont work --- type is private
        // type = "tree"



        // This works --- 'size' is protectd, Oak is subclass of plant
        this.size = "large";
    }
}
