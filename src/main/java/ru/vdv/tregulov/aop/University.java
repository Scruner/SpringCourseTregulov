package ru.vdv.tregulov.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Alexey Vedenistov", 5, 7.7);
        Student student2 = new Student("Iosif Stalin", 3, 9.8);
        Student student3 = new Student("Klim Voroshilov", 2, 5.3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
       // System.out.println(students.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
