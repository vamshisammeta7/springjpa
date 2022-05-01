package com.the33.SpringJpa.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Course {

    @Id
    @SequenceGenerator(name = "courseSequence",
    sequenceName = "courseSequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long courseId;
    private String courseName;
    private String credits;


    @ManyToOne(
            cascade = CascadeType.ALL
    )

    @JoinColumn(
            name = "teacherid",
            referencedColumnName = "teacherid"
    )
    private Teacher teacher;


    @ManyToMany
            (cascade = CascadeType.ALL)
    @JoinTable(
            name = "studentall",joinColumns = @JoinColumn(
            name = "courseId",
            referencedColumnName = "courseId"
    ),inverseJoinColumns =  @JoinColumn(
            name = "studentId",
            referencedColumnName = "studentId"))
    private List<Student> students;

    public void addStudents(Student student){

        if (students == null) students = new ArrayList<>();
        students.add(student);


    }



}
