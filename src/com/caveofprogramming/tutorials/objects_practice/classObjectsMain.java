package com.caveofprogramming.tutorials.objects_practice;

import javax.xml.crypto.Data;

//Instance Variable (data or "state")
class Person {
    int age;
    String name;

//    Classes can contain
//    1. Data
//    2. Subroutines (methods)
}

public class classObjectsMain {
    public static void main(String[] args) {

//      create a person object using the Pearson class
        Person personOne = new Person();

        personOne.age = 27;
        personOne.name = "Zelda";

        System.out.print(personOne.name + " ");
        System.out.println(personOne.age);

//      create a second person object
        Person personTwo = new Person();

        personTwo.age = 27;
        personTwo.name = "Link";

        System.out.print(personTwo.name + " ");
        System.out.println(personTwo.age);
    }
}

//TODO:
//> comment out the original code
//> build classes for name and age variables for better practice
