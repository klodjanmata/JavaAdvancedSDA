package javaTirana46.Inheritance;

public class Dog extends Animal implements Move, Eat{

    public Dog(String name, int age) {
        super.name = name;
        super.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound: Hum Hum");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void move() {
        System.out.println("Dog moves by walking");
    }
}
