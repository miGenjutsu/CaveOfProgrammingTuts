package com.caveofprogramming.tutorials.setters_and_this_practice;

class Frog {
    String name;
    int age;

    //  created a String setter
    public void setName(String newName) {
        name = newName;
    }

    //  created an int setter
    public void setAge(int newAge){
        age = newAge;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class SettersThisMain {
    public static void main(String[] args) {
        Frog frogOne = new Frog();

        frogOne.name = "Bertie"; /*setting an instance variable with an '=' sign*/
        frogOne.age = 3;

//      calling the setter
        frogOne.setName("Bertie"); /*this is different from line24 because im calling an actual method*/
    }
}



//TODO:
//> use the 'encapsulation' method in this code
//> set the String to private upon first call
//> set the int to private upon first call