package old.exercises.TestClasses;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public String getName() {
        return name;
    }
}
