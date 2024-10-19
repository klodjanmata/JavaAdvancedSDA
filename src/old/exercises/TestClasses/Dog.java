package old.exercises.TestClasses;

public class Dog extends Animal{

    private final String name = "Dog";
    private String dogsName;
    private int age;
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String dogsName, int age) {
        super(name);
        this.dogsName = dogsName;
        this.age = age;
    }

    public void printDog(){
        System.out.print("Dog Name: " + dogsName + ",\n" +
                "Dog age: " + age + ",\n" +
                "Noise it makes: "  );
        makeNoise();
    }

    @Override
    public void makeNoise() {
        System.out.println("Hum hum");
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDogsName() {
        return dogsName;
    }

    public void setDogsName(String dogsName) {
        this.dogsName = dogsName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
