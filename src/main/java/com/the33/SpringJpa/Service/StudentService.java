package com.the33.SpringJpa.Service;


import com.the33.SpringJpa.entity.Student;

import java.util.List;


public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getStudents();

    List<Student> getStudentByName(String firstName);

    List<Student> getStudentByNameStartingWith(String name);
}
