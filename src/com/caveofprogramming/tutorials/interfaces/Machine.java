package com.caveofprogramming.tutorials.interfaces;

public class Machine implements Info{
    private int id=7;

//    public Machine(int id) {
//        this.id = id;
//    }

    public void start() {
        System.out.println("Machine started...");
    }


    @Override
    public void showInfo() {
        System.out.println("Machine ID: "+id);
    }
}
