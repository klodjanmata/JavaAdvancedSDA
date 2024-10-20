package javaTirana46.exercises.Collections.Task2;

import java.util.Objects;

public class Author {
    private String name;
    private String lastname;
    private char gender;

    public Author(String name, String lastname, char gender) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender && Objects.equals(name, author.name) && Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
