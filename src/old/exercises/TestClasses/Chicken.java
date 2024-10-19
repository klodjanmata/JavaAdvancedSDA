package old.exercises.TestClasses;

import old.exercises.Interfaces.Prey;

public class Chicken implements Prey {
    private String type;
    private int age;

    public Chicken(String type, int age) {
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
        return "Chicken{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void flee() {
        System.out.println("Chicken flees by running or flying");
    }
}
