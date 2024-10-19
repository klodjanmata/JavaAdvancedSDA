package old.exercises.TestClasses;

import old.exercises.Interfaces.Predator;

public class Bear implements Predator {
    private String type;
    private int age;

    public Bear(String type, int age) {
        this.type = type;
        this.age = age;
    }

//    public void print(){
//        System.out.println(toString());
//    }
//


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
        return "Bear{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void hunt() {
        System.out.println("The bear is hunting!");
    }

    @Override
    public void eat() {
        System.out.println("Bear is eating!");
    }
}
