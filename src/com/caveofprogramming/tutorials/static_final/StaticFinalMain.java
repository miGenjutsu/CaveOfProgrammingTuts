package com.caveofprogramming.tutorials.static_final;

class Thing {
    public static final int LUCKY_NUMBER = 7;
    private String name;
    public static String description;
    public static int count=0;

    public Thing() { count++; }

    public void setName(String name) { this.name = name; }
    public String getName(){ return name; }

    public void showInfo() { System.out.println(description); }



}

public class StaticFinalMain {
    public static void main(String[] args) {
//      System.out.println("Created @ count: "+Thing.count);

        Thing thing = new Thing();
        Thing thing1 = new Thing();
        Thing.description = "I'am a Robot";
        System.out.println(Thing.description);
      System.out.println("Created @ count: "+Thing.count);

        thing.setName("Arlo");
        thing1.setName("Bixby");

        System.out.println(thing.getName());
        System.out.println(thing1.getName());


    }
}

//TODO:
// NEEDS:
// >> thing class
//    >> name & description
//    >> showName()
//    >> showInfo()
//    >> a count connected to class 'Thing' (hint: static)
//      >> to count the number of objects being created (hint: needs to be connected to set class)
//  >> a lucky number thats 'final'
// >> main class
//    >> description
//    >> retrieve the lucky number
//    >> retrieve the count

