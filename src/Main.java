import com.zhenya.domain.Book;
import com.zhenya.domain.Student;
import com.zhenya.domain.User;
import com.zhenya.repository.BookRepository;
import com.zhenya.repository.StudentRepository;
import com.zhenya.utils.BookUtil;
import com.zhenya.utils.StudentUtil;
import com.zhenya.utils.UserUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        System.out.println("==================================== TASK 1 =============================================");

        // Create an object of the BookRepository class
        BookRepository bookRepository = new BookRepository();

        // Create books
        BookUtil.createBooks(bookRepository);

        // Get all books through the getAllBooks method of the BookRepository class
        BookUtil.printCollection(bookRepository.getAllBooks());

        //Collections.sort(bookRepository.getAllBooks());

        // Delete book 7 through the deleteBook method of the BookRepository class
        bookRepository.deleteBook(7);

        // Making a division
        System.out.println("");

        // We display a new result without the 7th book through the getAllBooks method of the BookRepository class
        BookUtil.printCollection(bookRepository.getAllBooks());

        System.out.println("");

        System.out.println("==================================== TASK 2 =============================================");

        // Create an object of the BookRepository class
        BookRepository bookRepositorySet = new BookRepository();

        // Create books
        BookUtil.createBooksSet(bookRepositorySet);

        // Display information about books whose title starts with a vowel
        List<Book> bookArrayList = new ArrayList<>(bookRepositorySet.getAllBooksSet());
//        for (Book books: bookArrayList) {
//            System.out.println(books);
//        }

        List<String> stringList = bookArrayList.stream()
                .map(Book::getBookName)
                .filter(i -> i.substring(0, 1).matches("[AEUIOY]"))
                .toList();
        bookArrayList.stream()
                .filter(s -> stringList.contains(s.getBookName()))
                .forEach(System.out::println);


        System.out.println("");

        System.out.println("==================================== TASK 3 =============================================");

        // Create TreeSet for sorting
        Set<Book> sortBookHash = new TreeSet<>(bookRepositorySet.getAllBooksSet());

        // Create comparator for sorting TreeSet
        Comparator<Book> bookNameComparator = Comparator.comparing(Book::getBookName);
        Comparator<Book> authorNameComparator = Comparator.comparing(Book::getAuthorName);
        Comparator<Book> authorPatronymicComparator = Comparator.comparing(Book::getAuthorPatronymic);
        Comparator<Book> authorSurnameComparator = Comparator.comparing(Book::getAuthorSurname);

        /* We sort the books by the title of the book, then by the last name, first name, patronymic of the author
        of the book */
        System.out.println("                               SORTED BY BOOK NAME                                     ");
        Book.sort(sortBookHash, bookNameComparator);
        System.out.println("");
        System.out.println("                               SORTED BY AUTHOR NAME                                   ");
        Book.sort(sortBookHash, authorNameComparator);
        System.out.println("");
        System.out.println("                               SORTED BY AUTHOR PATRONYMIC                             ");
        Book.sort(sortBookHash, authorPatronymicComparator);
        System.out.println("");
        System.out.println("                               SORTED BY AUTHOR SURNAME                                ");
        Book.sort(sortBookHash, authorSurnameComparator);

        System.out.println("");

        System.out.println("==================================== TASK 4 =============================================");

        // Create an object of the BookRepository class
        StudentRepository studentRepository = new StudentRepository();

        // Create students and put them in an object of the StudentRepository class
        StudentUtil.createStudents(studentRepository);

        // Удаляем студентов выборочно через метод deleteStudent
        // studentRepository.deleteStudent(2);
        // studentRepository.deleteStudent(4);

        // Delete odd students by id and display even students
        for (Student student : studentRepository.getAllStudent()) {
            if (student.getId() % 2 == 0) {
                System.out.println(student);
            }
        }

        System.out.println("");

        System.out.println("============================== TASK 4 (Second option) ===================================");

        Student student = new Student(1, "Dima", "Ivanov");
        Student student1 = new Student(2, "Sasha", "Petrov");
        Student student2 = new Student(3, "Alena", "Smirnova");
        Student student3 = new Student(4, "Vika", "Morozova");
        Student student4 = new Student(5, "Arkadi", "Selivanov");

        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.add(student);
        studentTreeSet.add(student1);
        studentTreeSet.add(student2);
        studentTreeSet.add(student3);
        studentTreeSet.add(student4);

        int i = 1;
        for (Iterator<Student> studentIterator = studentTreeSet.iterator(); studentIterator.hasNext(); ) {
            studentIterator.next();
            if (i % 2 != 0) {
                studentIterator.remove();
            }
            i++;
        }

        for (Student st : studentTreeSet) {
            System.out.println(st);
        }

        System.out.println("===================================== TASK 5 ============================================");

        List<User> users = UserUtil.createUsers();
        UserUtil.printAllUsers(users, 5);
    }
}
