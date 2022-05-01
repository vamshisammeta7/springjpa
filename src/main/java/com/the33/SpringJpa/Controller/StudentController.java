package com.the33.SpringJpa.Controller;

import com.the33.SpringJpa.Service.StudentService;
import com.the33.SpringJpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentservice;


    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){

        return studentservice.saveStudent(student);


    }

    @GetMapping("/students")
    public List<Student> getStudents(){

      return   studentservice.getStudents();

    }

    @GetMapping("/students/{name}")
    public List<Student> getStudentByName(@PathVariable("name") String firstName){
        return  studentservice.getStudentByName(firstName);
    }

    @GetMapping("/students/name/{letter}")
    public List<Student> getStudentByNameStartingWith(@PathVariable("letter") String name){
        return studentservice.getStudentByNameStartingWith(name);
    }

    @GetMapping("/students/mail/{mailId}")
    public List<Student> getStudentByEmailId(@PathVariable("mailId") String mailId){
        return studentservice.getStudentByEmailId(mailId);
    }

    @PutMapping("/students/{lastname}")
    public int updateStudent(@PathVariable("lastname") String lastName,@RequestBody String firstName){
        return studentservice.updateStudent(firstName,lastName);
    }



}
