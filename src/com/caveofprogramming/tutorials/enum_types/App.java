package src.com.caveofprogramming.tutorials.enum_types;

public class App {
    public static void main(String[] args) {

        Animal animal = Animal.CAT;

        switch (animal) {

            case CAT:
                System.out.println("MEOW");
                break;
            case DOG:
                System.out.println("WOOF");
                break;
            case BIRD:
                System.out.println("CHIRP");
                break;
            default:
                System.out.println("ERROR");
                break;
        }

        System.out.println(Animal.DOG.getClass());

        System.out.println(Animal.DOG instanceof Enum);

        System.out.println(Animal.BIRD.getName());

        System.out.println(Animal.DOG);
        System.out.println("Enum name has a string: "+Animal.DOG.name());

        Animal animal1 = Animal.valueOf("CAT");
        System.out.println(animal1);
    }
}
