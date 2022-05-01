package com.the33.SpringJpa.Repository;

import com.the33.SpringJpa.entity.Course;
import com.the33.SpringJpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCourseMaterial {
    @Autowired
    private CourseMaterialRepository CMrepo;

@Test
    public void saveCM(){

        Course course = Course.builder()
                .courseName("python").credits("8").build();



        CourseMaterial cm = CourseMaterial.builder()
                .url("www.udemy.com").course(course).build();

        CMrepo.save(cm);
    }

}
