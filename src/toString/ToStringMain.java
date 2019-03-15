package toString;

class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
//        return String.format("%d : %s", id, name);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(id)
                .append(": ")
                .append(name);
        return stringBuilder.toString();
    }
}

public class ToStringMain {
    public static void main(String[] args) {
        Frog frog = new Frog(1, "Freddy");
        Frog frog1 = new Frog(2, "Roger");

        System.out.println(frog);
        System.out.println(frog1);
    }
}


//frog names freddy, roger