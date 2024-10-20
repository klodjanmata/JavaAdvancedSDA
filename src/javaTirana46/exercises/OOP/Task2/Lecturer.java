package javaTirana46.exercises.OOP.Task2;

public class Lecturer extends Person {
    private String specialty;
    private int salary;

    public Lecturer(String name, String address, String specialty, int salary) {
        super(name, address);
        this.specialty = specialty;
        this.salary = salary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + salary + " -> " + specialty;
    }
}
