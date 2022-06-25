package com.zhenya.utils;

import com.zhenya.domain.Student;
import com.zhenya.repository.StudentRepository;

import java.util.TreeSet;

public class StudentUtil {
    public static void createStudents(StudentRepository studentRepository) {
        studentRepository.createStudent(new Student(1, "Dima", "Ivanov"));
        studentRepository.createStudent(new Student(2, "Sasha", "Petrov"));
        studentRepository.createStudent(new Student(3, "Alena", "Smirnova"));
        studentRepository.createStudent(new Student(4, "Vika", "Morozova"));
        studentRepository.createStudent(new Student(5, "Arkadi", "Selivanov"));
    }

    public static void printCollection(TreeSet<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
