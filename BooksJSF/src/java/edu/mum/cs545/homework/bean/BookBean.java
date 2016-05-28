/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.homework.bean;

import edu.mum.cs545.homework.pojo.Book;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author kb
 */
@Named(value = "bookbean")
@ApplicationScoped
public class BookBean {

    private Book book = new Book();
    private List<Book> books = new ArrayList<>();

    public BookBean() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String addBook() {

        books.add(book);

        return "home.jsf";
    }

    public String removeAllBooks() {

        books.removeAll(books);
        return "addBook.jsf";
    }

    public String removeBook() {
        books.remove(book);
        return "addBook.jsf";
    }

}
