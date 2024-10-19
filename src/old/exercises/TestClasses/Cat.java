package old.exercises.TestClasses;

public class Cat extends  Animal {

    private final String name = "Cat";
    private String catsName;
    private int age;

    public Cat(String name, String catsName, int age) {
        super(name);
        this.catsName = catsName;
        this.age = age;
    }

    public Cat(String name) {
        super("Cat");
    }

    public void printCat(){
        System.out.print("Cats Name: " + catsName + ",\n" +
                            "Cats age: " + age + ",\n" +
                            "Noise it makes: "  );
        makeNoise();
    }
    @Override
    public void makeNoise() {
        System.out.println("meow meow");
    }

    @Override
    public String getName() {
        return name;
    }

    public String getCatsName() {
        return catsName;
    }

    public void setCatsName(String catsName) {
        this.catsName = catsName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
