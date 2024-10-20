package javaTirana46.exercises.Collections.Task2;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books;
    public BookService() {
        books = new ArrayList<Book>();
    }

    public BookService(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllFantasyBooks() {
        List<Book> fantasyBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(Genre.Fantasy)) {
                fantasyBooks.add(book);
            }
        }
        return fantasyBooks;
    }

    public List<Book> getByGenre(Genre genre) {
        List<Book> genreBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                genreBooks.add(book);
            }
        }
        return genreBooks;
    }

    public List<Book> getOlderThan1999(){
        List<Book> oldestBooks = new ArrayList<>();
        for(Book book : books){
            if(book.getYearOfRelease() < 1999){
                oldestBooks.add(book);
            }
        }
        return oldestBooks;
    }

    public Book theMostExpensive(){
        Book mostExpensiveBook = null;
        float maxPrice = Float.MIN_VALUE;
        for (Book book : books) {
            if(book.getPrice() > maxPrice){
                maxPrice = book.getPrice();
                mostExpensiveBook = book;
            }
        }
        return mostExpensiveBook;
    }

    public Book cheapestBook(){
        Book cheapestBook = null;
        float minPrice = Float.MAX_VALUE;
        for (Book book : books) {
            if(book.getPrice() < minPrice){
                minPrice = book.getPrice();
                cheapestBook = book;
            }
        }
        return cheapestBook;
    }

    public Book aBookBy3Authors() {
        for (Book book : books) {
            if(book.getAuthors().size() == 3){
                return book;
            }
        }
        return null;
    }

    public List<Book> booksWith3Authors() {
        List<Book> booksWith3Authors = new ArrayList<>();
        for (Book book : books) {
            if(book.getAuthors().size() == 3){
                booksWith3Authors.add(book);
            }
        }
        return booksWith3Authors;
    }

    public boolean bookExists(Book book) {
        return books.contains(book);
    }

    public List<Book> getAuthorBookList(Author author){
        List<Book> booksOfAuthor = new ArrayList<>();
        for(Book book:books){
            if(book.getAuthors().contains(author)){
                booksOfAuthor.add(book);
            }
        }
        return booksOfAuthor;
    }

    public List<Book> getBooks() {
        return books;
    }

}
