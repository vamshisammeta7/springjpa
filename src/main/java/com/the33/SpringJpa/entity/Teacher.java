package com.the33.SpringJpa.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {

    @Id
    @SequenceGenerator(name = "teacherSequence",
    sequenceName = "teacherSequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long teacherId;
    private String teacherName;


}
