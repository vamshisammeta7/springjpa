package com.the33.SpringJpa.Repository;


import com.the33.SpringJpa.entity.Course;
import com.the33.SpringJpa.entity.Student;
import com.the33.SpringJpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestCourse {
    @Autowired
    private CourseRepository courseRepo;
    @Test
    public void saveCourse(){

        Teacher teacher = Teacher.builder()
                .teacherName("nancy").build();

        Course course = Course.builder()
                .courseName("Java")
                .credits("6")
                .teacher(teacher)
                .build();

        courseRepo.save(course);

    }
    @Test
    public void getAllCourses(){
       List<Course> c = courseRepo.findAll();
        System.out.println(c);
    }


    @Test
    public void saveStudentWithCourse(){
        Teacher teacher = Teacher.builder()
                .teacherName("ram").build();

        Student student = Student.builder()
                .firstName("mahesh")
                .lastName("babu")
                .mailId("mb@gmail.com").build();

        Course course = Course.builder()
                .courseName("spring").credits("10")
                .teacher(teacher).build();
        course.addStudents(student);

        courseRepo.save(course);
    }


}
