package javaTirana46.Inheritance;

public abstract class Animal {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();

    public void printAnimal(){
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }

}
