package src.com.caveofprogramming.tutorials.enum_types;

public enum Animal {
    DOG("GIZMO"), CAT("Felix"), BIRD("Tweety");

    private String name;

    Animal(String name) {
            this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "This animal is called "+name;
    }
}
