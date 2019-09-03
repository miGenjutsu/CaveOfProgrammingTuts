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

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
} //stopped @ 6:11 on video


public class App {
    public static void main(String[] args) {
        Person person = new Person(5, "Zelda");
        Person person1 = new Person(5, "Zeldoa");
//        Person person1 = new Person(8, "Link");
//        person1 = person;
//        System.out.println(person == person1);

        System.out.println(person.equals(person1));;
    }
}
