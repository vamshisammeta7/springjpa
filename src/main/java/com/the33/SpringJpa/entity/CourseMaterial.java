package com.the33.SpringJpa.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {

    @Id
    @SequenceGenerator(name ="courseMaterial",
            sequenceName = "courseMaterial",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long courseMaterialId;
    private String url;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseId",
    referencedColumnName = "courseId")

    private Course course;
}
