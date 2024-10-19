package javaTirana46.exercises.Task2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mirsalda",
                                        "Has",
                                        "Inxhinieri Informatike",
                                        3,
                                        125);
        System.out.println(s1.toString());

        Lecturer l1 = new Lecturer("Deslinda",
                        "Kukes",
                        "Java Developer",
                            3000);
        System.out.println(l1.toString());
    }
}
