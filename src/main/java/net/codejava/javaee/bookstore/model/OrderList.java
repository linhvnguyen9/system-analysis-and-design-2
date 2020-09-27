package net.codejava.javaee.bookstore.model;

import java.util.List;

public class OrderList {
    private List<Book> books;

    public OrderList(List<Book> books) {
        this.books = books;
    }

    public OrderList() {
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(Book b) {
        books.remove(b);
    }

    public List<Book> getBooks() {
        return books;
    }
}
