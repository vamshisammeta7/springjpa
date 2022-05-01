package com.the33.SpringJpa.Service;


import com.the33.SpringJpa.Repository.StudentRepository;
import com.the33.SpringJpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();

    }

    @Override
    public List<Student> getStudentByName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }

    @Override
    public List<Student> getStudentByNameStartingWith(String name) {
        return studentRepository.findByFirstNameStartingWith(name);
    }
}
