package javaTirana46.Inheritance;

public class Cat extends Animal implements Move, Eat {

    public Cat(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void move() {
        System.out.println("Cat is walking and jumping.");
    }
}
