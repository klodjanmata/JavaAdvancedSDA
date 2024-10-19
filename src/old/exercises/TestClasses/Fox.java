package old.exercises.TestClasses;

import old.exercises.Interfaces.Predator;
import old.exercises.Interfaces.Prey;

public class Fox implements Predator, Prey {
    private String type;
    private int age;

    public Fox(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void hunt() {
        System.out.println("Fox is hunting, running and sneeking!");
    }

    @Override
    public void eat() {
        System.out.println("Fox is eating!");
    }

    @Override
    public void flee() {
        System.out.println("Fux flees by running!");
    }
}
