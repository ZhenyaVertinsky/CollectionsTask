package com.zhenya.repository;

import com.zhenya.domain.Book;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class BookRepository {
    private List<Book> books = new LinkedList<>();

    private Set<Book> booksSet = new HashSet<>(25);


    public void createBook(Book book) {
        books.add(book);
    }

    public void createBookSet(Book bookSet) {
        booksSet.add(bookSet);
    }


    public Book getById(Integer id) {
        return books.stream()
                .filter(book -> Objects.equals(book.getId(), id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book by ID not found"));
    }

    public Book getByIdSet(Integer id) {
        return booksSet.stream()
                .filter(book -> Objects.equals(book.getId(), id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book by ID not found"));
    }


    public List<Book> getAllBooks() {
        return books;
    }

    public Set<Book> getAllBooksSet() {
        return booksSet;
    }


    public void deleteBook(Integer id) {
        Book bookById = getById(id);
        books.remove(bookById);
    }

    public void deleteBookSet(Integer id) {
        Book bookById = getById(id);
        booksSet.remove(bookById);
    }
}
