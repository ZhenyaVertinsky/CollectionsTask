# CollectionsTask
1. Create an instance of the LinkedList class, place 20 objects of the Book class in it.
Display information about all books. Programmatically remove the 7th book from the collection, display information
about the remaining books.
2. Create an instance of the HashSet class, add 25 instances of the Book class to it, provide at least 6 identical
books. Display information about books (contained in a HashSet collection) whose titles begin with a vowel.
3. Sort the collection of 25 books by last name, then by first name, by patronymic of the author of the book
(these fields must be added to the Book class). Output 3 sorting results by different parameters, provide the
ability to pass the sort field as a method parameter.
4. Create an instance of the TreeSet class, place objects of the Student class into it (you need to design it).
Display information about each even student in the list, remove each odd student from the collection.
5. public class User {
    private Long id;
    private String name;
    private String name;
    private List<User> friends;
}

//Output example: Slava -> {Matvei, Lisa, Vanya, Artem} -> {} -> {} -> {} -> {}

Given a User class. It is necessary to generate objects of the User class, fill in all the fields and
the List<User> friends list with other objects of the User class. List the names of friends, friends of friends,
and so on for the user up to 5 levels of nesting.

P.S.
1) the generation of all objects must be done in a static method of the utility class for each individual entity.
Be sure to provide a mechanism for generating a random string of a certain size in one
of the classes Book, Student.
2) the method for demonstrating the elements of the collection is also implemented in the utility class as
a static method.
