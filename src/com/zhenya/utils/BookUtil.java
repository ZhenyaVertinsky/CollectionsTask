package com.zhenya.utils;

import com.zhenya.domain.Book;
import com.zhenya.repository.BookRepository;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class BookUtil {
    public static void createBooks(BookRepository bookRepository) {

        bookRepository.createBook(new Book(1, "Eugene Onegin", "Alexander", "Sergeevich", "Pushkin"));
        bookRepository.createBook(new Book(2, "Suitcase", "Sergey", "Donatovich", "Dovlatov"));
        bookRepository.createBook(new Book(3, "Three sisters", "Anton", "Pavlovich", "Chekhov"));
        bookRepository.createBook(new Book(4, "The hero of our time", "Mikhail", "Yurievich", "Lermontov"));
        bookRepository.createBook(new Book(5, "Dead souls", "Nikolai", "Vassilyevich", "Gogol"));
        bookRepository.createBook(new Book(6, "Dark alleys", "Ivan", "Alekseevich", "Bunin"));
        bookRepository.createBook(new Book(7, "Who is to blame?", "Alexander", "Ivanovich", "Herzen"));
        bookRepository.createBook(new Book(8, "Oblomov", "Ivan", "Alexandrovich", "Goncharov"));
        bookRepository.createBook(new Book(9, "Fathers and children", "Ivan", "Sergeevich", "Turgenev"));
        bookRepository.createBook(new Book(10, "The Master and Margarita", "Mikhail", "Afanasievich", "Bulgakov"));
        bookRepository.createBook(new Book(11, "War and peace", "Lev", "Nikolaevich", "Tolstoy"));
        bookRepository.createBook(new Book(12, "Quiet Don", "Mikhail", "Alexandrovich", "Sholokhov"));
        bookRepository.createBook(new Book(13, "Thunderstorm", "Alexander", "Nikolaevich", "Ostrovsky"));
        bookRepository.createBook(new Book(14, "Left-handed", "Nikolai", "Semyonovich", "Leskov"));
        bookRepository.createBook(new Book(15, "Crime and punishment", "Fyodor", "Mikhailovich", "Dostoevsky"));
        bookRepository.createBook(new Book(16, "How steel was tempered", "Nikolai", "Alekseevich", "Ostrovsky"));
        bookRepository.createBook(new Book(17, "Lolita", "Vladimir", "Vladimirovich", "Nabokov"));
        bookRepository.createBook(new Book(18, "Son of the regiment", "Valentin", "Petrovich", "Kataev"));
        bookRepository.createBook(new Book(19, "Doctor Zhivago", "Boris", "Leonidovich", "Pasternak"));
        bookRepository.createBook(new Book(20, "GULAG Archipelago", "Alexander", "Isaevich", "Solzhenitsyn"));
    }


    public static void printCollection(List<Book> list) {
        for (Book books : list) {
            System.out.println(books);
        }
    }


    public static void createBooksSet(BookRepository bookRepositorySet) {
        bookRepositorySet.createBookSet(new Book(11, "Eugene Onegin", "Alexander", "Sergeevich", "Pushkin"));
        bookRepositorySet.createBookSet(new Book(21, "Suitcase", "Sergey", "Donatovich", "Dovlatov"));
        bookRepositorySet.createBookSet(new Book(31, "Three sisters", "Anton", "Pavlovich", "Chekhov"));
        bookRepositorySet.createBookSet(new Book(41, "The hero of our time", "Mikhail", "Yurievich", "Lermontov"));
        bookRepositorySet.createBookSet(new Book(51, "Dead souls", "Nikolai", "Vassilyevich", "Gogol"));
        bookRepositorySet.createBookSet(new Book(61, "Dark alleys", "Ivan", "Alekseevich", "Bunin"));
        bookRepositorySet.createBookSet(new Book(71, "Who is to blame?", "Alexander", "Ivanovich", "Herzen"));
        bookRepositorySet.createBookSet(new Book(81, "Oblomov", "Ivan", "Alexandrovich", "Goncharov"));
        bookRepositorySet.createBookSet(new Book(91, "Fathers and children", "Ivan", "Sergeevich", "Turgenev"));
        bookRepositorySet.createBookSet(new Book(31, "Three sisters", "Anton", "Pavlovich", "Chekhov"));
        bookRepositorySet.createBookSet(new Book(41, "The hero of our time", "Mikhail", "Yurievich", "Lermontov"));
        bookRepositorySet.createBookSet(new Book(101, "The Master and Margarita", "Mikhail", "Afanasievich", "Bulgakov"));
        bookRepositorySet.createBookSet(new Book(111, "War and peace", "Lev", "Nikolaevich", "Tolstoy"));
        bookRepositorySet.createBookSet(new Book(121, "Quiet Don", "Mikhail", "Alexandrovich", "Sholokhov"));
        bookRepositorySet.createBookSet(new Book(131, "Thunderstorm", "Alexander", "Nikolaevich", "Ostrovsky"));
        bookRepositorySet.createBookSet(new Book(141, "Left-handed", "Nikolai", "Semyonovich", "Leskov"));
        bookRepositorySet.createBookSet(new Book(151, "Crime and punishment", "Fyodor", "Mikhailovich", "Dostoevsky"));
        bookRepositorySet.createBookSet(new Book(161, "How steel was tempered", "Nikolai", "Alekseevich", "Ostrovsky"));
        bookRepositorySet.createBookSet(new Book(171, "Lolita", "Vladimir", "Vladimirovich", "Nabokov"));
        bookRepositorySet.createBookSet(new Book(181, "Son of the regiment", "Valentin", "Petrovich", "Kataev"));
        bookRepositorySet.createBookSet(new Book(191, "Doctor Zhivago", "Boris", "Leonidovich", "Pasternak"));
        bookRepositorySet.createBookSet(new Book(201, "GULAG Archipelago", "Alexander", "Isaevich", "Solzhenitsyn"));
        bookRepositorySet.createBookSet(new Book(111, "War and peace", "Lev", "Nikolaevich", "Tolstoy"));
        bookRepositorySet.createBookSet(new Book(121, "Quiet Don", "Mikhail", "Alexandrovich", "Sholokhov"));
        bookRepositorySet.createBookSet(new Book(131, "Thunderstorm", "Alexander", "Nikolaevich", "Ostrovsky"));
    }


    public static void printCollectionSet(HashSet<Book> bookHashSet) {
        for (Book booksSet : bookHashSet) {
            System.out.println(booksSet);
        }
    }


    public static void printCollectionSet(TreeSet<Book> bookHashSet) {
        for (Book booksSet : bookHashSet) {
            System.out.println(booksSet);
        }
    }
}
