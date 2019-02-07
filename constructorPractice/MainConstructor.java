class Machine {
    private String name;
    private int number;

    public Machine() {
        name = "Arlo";
        number = 00;
        System.out.println("First Constructor Name: "+name+"  and Number: "+number);
    }

    public Machine(String name, int number) {
        this.name = name;
        this.number = number;
        System.out.println("Second Constructor Name: "+name+"  and Number: "+number);
    }
}


public class MainConstructor {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Machine machine1 = new Machine("R2D2", 01);
    }
}

//TODO:
//> create a 'car' class
//> set in 'car' class a car name, car make, and car color
//> call from main
//> change the color of car