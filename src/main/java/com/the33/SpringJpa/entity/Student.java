package com.the33.SpringJpa.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "Student_table",
uniqueConstraints =
@UniqueConstraint(columnNames = {"lastName","mailId"}))
@Builder
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long studentId;
    private String firstName;
    private String lastName;
    private String mailId;
    @Embedded
    private Gaurdian gaurdian;



}
