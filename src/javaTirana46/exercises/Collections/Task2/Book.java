package javaTirana46.exercises.Collections.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private float price;
    private int yearOfRelease;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, float price, int yearOfRelease) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = new ArrayList<>();
        this.genre = Genre.Unknown;
    }

    public Book(String title, float price, int yearOfRelease, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = authors;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfRelease=" + yearOfRelease +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Float.compare(price, book.price) == 0 && yearOfRelease == book.yearOfRelease && Objects.equals(title, book.title) && Objects.equals(authors, book.authors) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfRelease, authors, genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
