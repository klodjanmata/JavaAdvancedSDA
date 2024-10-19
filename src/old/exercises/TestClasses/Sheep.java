package old.exercises.TestClasses;

import old.exercises.Interfaces.Prey;

public class Sheep implements Prey {
    private String type;
    private String color;
    private int age;

    public Sheep(String type, String color, int age) {
        this.type = type;
        this.color = color;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void flee() {
        System.out.println("Sheep flees by running");
    }
}
