package com.zhenya.repository;

import com.zhenya.domain.Student;

import java.util.Objects;
import java.util.TreeSet;

public class StudentRepository {
    private TreeSet<Student> students = new TreeSet<>();

    public void createStudent(Student student) {
        students.add(student);
    }


    public Student getById(Integer id) {
        return students.stream()
                .filter(book -> Objects.equals(book.getId(), id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book by ID not found"));
    }


    public TreeSet<Student> getAllStudent() {
        return students;
    }


    public void deleteStudent(Integer id) {
        Student studentById = getById(id);
        students.remove(studentById);
    }
}
