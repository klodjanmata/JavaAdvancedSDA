package javaTirana46.exercises.Collections.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Book> generateBooks(List<Author> authors) {
        List<Book> books = new ArrayList<>();
        // Hardcoded books
        books.add(new Book("Action Book 1", 20.99f, 2020, Arrays.asList(authors.get(1)), Genre.Action));
        books.add(new Book("Romance Book 1", 15.99f, 2019, Arrays.asList(authors.get(2)), Genre.Romance));
        books.add(new Book("Poetic Book 1", 12.50f, 2021, Arrays.asList(authors.get(3)), Genre.Poetic));
        books.add(new Book("Scientific Book 1", 30.00f, 2018, Arrays.asList(authors.get(4)), Genre.Scientific));
        books.add(new Book("Biography Book 1", 18.75f, 2022, Arrays.asList(authors.get(5)), Genre.Biography));
        books.add(new Book("History Book 1", 25.00f, 2017, Arrays.asList(authors.get(6)), Genre.History));
        books.add(new Book("Nonfiction Book 1", 22.50f, 2021, Arrays.asList(authors.get(7)), Genre.Nonfiction));
        books.add(new Book("Comics Book 1", 10.00f, 2020, Arrays.asList(authors.get(0)), Genre.Comics));
        books.add(new Book("Novels Book 1", 19.99f, 2019, Arrays.asList(authors.get(1), authors.get(2)), Genre.Novels));
        books.add(new Book("Classic Book 1", 17.50f, 2015, Arrays.asList(authors.get(3), authors.get(4)), Genre.Classic));
        books.add(new Book("Fantasy Book 1", 28.00f, 2016, Arrays.asList(authors.get(5), authors.get(6)), Genre.Fantasy));
        books.add(new Book("Unknown Genre Book", 14.99f, 2020, Arrays.asList(authors.get(7), authors.get(0)), Genre.Unknown));
        books.add(new Book("Action Book 2", 21.99f, 2021, Arrays.asList(authors.get(1), authors.get(6)), Genre.Action));
        books.add(new Book("Romance Book 2", 16.50f, 2020, Arrays.asList(authors.get(2), authors.get(7)), Genre.Romance));
        books.add(new Book("Poetic Book 2", 13.00f, 2018, Arrays.asList(authors.get(3), authors.get(0)), Genre.Poetic));
        books.add(new Book("Scientific Book 2", 31.00f, 2019, Arrays.asList(authors.get(4), authors.get(1)), Genre.Scientific));
        books.add(new Book("Biography Book 2", 19.25f, 2017, Arrays.asList(authors.get(5), authors.get(2)), Genre.Biography));
        books.add(new Book("History Book 2", 26.50f, 2021, Arrays.asList(authors.get(6), authors.get(3)), Genre.History));
        books.add(new Book("Nonfiction Book 2", 23.50f, 2019, Arrays.asList(authors.get(7), authors.get(4)), Genre.Nonfiction));
        books.add(new Book("Comics Book 2", 11.50f, 2020, Arrays.asList(authors.get(0), authors.get(5)), Genre.Comics));
        books.add(new Book("Novels Book 2", 20.50f, 2021, Arrays.asList(authors.get(1), authors.get(6)), Genre.Novels));
        books.add(new Book("Classic Book 2", 18.50f, 2016, Arrays.asList(authors.get(3), authors.get(4)), Genre.Classic));
        books.add(new Book("Fantasy Book 2", 29.50f, 2022, Arrays.asList(authors.get(5), authors.get(6)), Genre.Fantasy));
        books.add(new Book("Unknown Genre Book 2", 16.99f, 2018, Arrays.asList(authors.get(7), authors.get(0)), Genre.Unknown));

        books.add(new Book("Action Book 3", 22.99f, 2018, Arrays.asList(authors.get(1), authors.get(3)), Genre.Action));
        books.add(new Book("Romance Book 3", 17.50f, 2020, Arrays.asList(authors.get(2), authors.get(4)), Genre.Romance));
        books.add(new Book("Poetic Book 3", 14.50f, 2021, Arrays.asList(authors.get(3), authors.get(5)), Genre.Poetic));
        books.add(new Book("Scientific Book 3", 32.00f, 2017, Arrays.asList(authors.get(4), authors.get(6)), Genre.Scientific));
        books.add(new Book("Biography Book 3", 20.00f, 2016, Arrays.asList(authors.get(5), authors.get(7)), Genre.Biography));

        return books;
    }

    public static List<Author> generateAuthors(){
        List<Author> authors = new ArrayList<>();
        authors.add( new Author("Isabella", "Taylor", 'F'));
        authors.add( new Author("John", "Smith", 'M'));
        authors.add( new Author("Emma", "Johnson", 'F'));
        authors.add( new Author("James", "Williams", 'M'));
        authors.add( new Author("Sophia", "Brown", 'F'));
        authors.add( new Author("David", "Jones", 'M'));
        authors.add( new Author("Mia", "Davis", 'F'));
        authors.add( new Author("Alexander", "Miller", 'M'));
        return authors;
    }

    public static void main(String[] args) {
        List<Author> authors = generateAuthors();
        BookService library = new BookService(generateBooks(authors));
        List<Book> FirstAuthorsBooks = library.getAuthorBookList(authors.get(0));
        for (Book book : FirstAuthorsBooks) {
            System.out.println(book.toString());
        }
    }
}

