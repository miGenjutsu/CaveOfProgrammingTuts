//Continuation from "classObjectsPractice"

class Persons {
    int age;
    String name;

    void sayHello() {
        System.out.println("Hello, my name is " +name+ " and I'm " +age+ " years old.");
    }
}

public class MethodsPracticeMain {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Persons personsOne = new Persons();
        personsOne.name = "Link";
        personsOne.age = 27;
        personsOne.sayHello();
        System.out.print(personsOne.name + " ");
        System.out.println(personsOne.age);



        Persons personsTwo = new Persons();
        personsTwo.name = "Zelda";
        personsTwo.age = 27;
        personsTwo.sayHello();
        System.out.print(personsTwo.name + " ");
        System.out.println(personsTwo.age);
    }
}

//TODO:
// > make a method tited "Pearsons"
//  >> pass it an age and name
// > within "Pearsons" make a "speak" class
//  >> ouput persons name and age to console
// > in 'main' call the "Pearsons" method