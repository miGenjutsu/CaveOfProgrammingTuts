package src.com.caveofprogramming.tutorials.equals_method;

import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
} //stopped @ 6:11 on video


public class App {
    public static void main(String[] args) {
        Person person = new Person(5, "Zelda");
        Person person1 = new Person(5, "Zelda");
//        Person person1 = new Person(8, "Link");
//        person1 = person;
//        System.out.println(person == person1);

        System.out.println(person.equals(person1));


        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1 == value2);

//        System.out.println(value1.equals(value2));

        Integer number1 = 6;
        Integer number2 = 6;

        System.out.println(number1 == number2);

//        System.out.println(number1.equals(number2));

        String text1 = "Hello";
        String text2 = "Hello";

        System.out.println(text1 == text2);

    }
}

//NOTE::
// do not compare non primitive number with "==" only use "==" to check if two references point to the same objects
// ALWAYS use .equals() to compare Strings

// "==" is used to compare the literal same object
// .equals() is used to compare the meaning (which is what you always want with Strings)