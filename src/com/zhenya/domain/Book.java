package com.zhenya.domain;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;

public class Book implements Comparable<Book> {

    private Integer id;

    private String bookName;

    private String authorName;

    private String authorPatronymic;

    private String authorSurname;


    public Book(Integer id, String bookName, String authorName, String authorPatronymic, String authorSurname) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.authorPatronymic = authorPatronymic;
        this.authorSurname = authorSurname;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) && Objects.equals(authorPatronymic, book.authorPatronymic)
                && Objects.equals(authorSurname, book.authorSurname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, authorName, authorPatronymic, authorSurname);
    }


    // Переопределяем метод toString
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorPatronymic='" + authorPatronymic + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                '}';
    }


    public static void sort(Set<Book> bookSet, Comparator<Book> comparator) {
        bookSet.stream().sorted(comparator).forEach(System.out::println);
    }

    @Override
    public int compareTo(Book book) {
        return this.id - book.getId();
        //return bookName.compareTo(book.getBookName());
    }
}
