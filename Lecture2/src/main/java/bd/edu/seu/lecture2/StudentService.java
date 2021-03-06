/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.lecture2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author seu
 */
public class StudentService {
    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(345, "John Doe", 3.22));
//        studentList.add(new Student(319, "Jane Doe", 3.92));
//        studentList.add(new Student(231, "Salah Uddin", 2.46));
//        studentList.add(new Student(281, "Hasibur Rahman", 1.87));
//        studentList.add(new Student(100, "Abul", 2.11));
//        studentList.add(new Student(101, "Babul", 3.12));
//        studentList.add(new Student(102, "Kabul", 2.99));
//        studentList.add(new Student(103, "Ratul", 0.11));
//        studentList.add(new Student(104, "Putul", 0.87));
//        studentList.add(new Student(105, "Tetul", 3.21));
//        studentList.add(new Student(106, "Tutul", 3.45));
        int n = 10_000_000;
        final double EPS = 1E-4;
        /*
        for (int i = 0; i < n; i++) {
            long id = i + 1;
            String name = "Mehedi Hasan";
            double cgpa = Math.random() * 4 + EPS;
            if (cgpa > 4)
                cgpa = 4;
            Student student = new Student(id, name, cgpa);
            studentList.add(student);
        }
        */
        studentList = IntStream
                .rangeClosed(1, n)
                //.parallel()
                .mapToObj(id -> {
                    String name = "Mehedi Hasan";
                    double cgpa = Math.random() * 4 + EPS;
                    if (cgpa > 4)
                        cgpa = 4;
                    Student student = new Student(id, name, cgpa);
                    return student;
                })
                .collect(Collectors.toList());
        //Collections.shuffle(studentList);
        
        return studentList;
    }
}












