package javaTirana46.exercises.OOP.Task2;

public class Student extends Person {
    private String typeOfStudy;
    private int yearOfStudy;
    private int price;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, int price) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.price = price;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +" -> " + typeOfStudy +
                " -> " + yearOfStudy +
                " -> " + price;
    }
}
