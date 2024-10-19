package old.exercises.TestClasses;

import old.exercises.Interfaces.Predator;

public class Lion implements Predator {
    private String placeOfLiving;
    private int age;
    private char gender;

    public Lion(String placeOfLiving, int age, char gender) {
        this.placeOfLiving = placeOfLiving;
        this.age = age;
        this.gender = gender;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public void setPlaceOfLiving(String placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "placeOfLiving='" + placeOfLiving + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void hunt() {
        System.out.println("Lion is hunting! You better hide.");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }
}
