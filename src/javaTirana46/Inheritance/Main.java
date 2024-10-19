package javaTirana46.Inheritance;

public class Main{

    public static void main(String[] args) {
        Dog dog = new Dog("Lesi", 4);
        Cat cat = new Cat("Angel", 2);
        dog.makeSound();
        cat.makeSound();
        dog.printAnimal();
        cat.printAnimal();
    }

}
