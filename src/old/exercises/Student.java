package old.exercises;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String surname;
    private String subject;
    private int age;
    private char gender;
    private int yearOfStart;
    private int yearOfStudying;

    public Student(){

    }

    public Student(int id, String name, String surname, int age, char gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public Student(int id, String name, String surname, String subject, int age, char gender, int yearOfStart, int yearOfStudying) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.age = age;
        this.gender = gender;
        this.yearOfStart = yearOfStart;
        this.yearOfStudying = yearOfStudying;
    }

    public void printStudent(){

        System.out.println(toString());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYearOfStart() {
        return yearOfStart;
    }

    public void setYearOfStart(int yearOfStart) {
        this.yearOfStart = yearOfStart;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(int yearOfStudying) {
        this.yearOfStudying = yearOfStudying;
    }

    @Override
    public String toString() {
        return "old.exercises.Student{" +
                "id=" + id +
                ", name='" + name + '\'' + '\t' +
                ", surname='" + surname + '\'' + '\t' + '\t' +
                ", subject='" + subject + '\'' + '\t' +
                ", age=" + age + '\t' +  '\t' +
                ", gender=" + gender + '\t' + '\t' +
                ", yearOfStart=" + yearOfStart + '\t' + '\t' +
                ", yearOfStudying=" + yearOfStudying + '\t' + '\t' +
                '}';
    }
}
