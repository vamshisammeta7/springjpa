package com.the33.SpringJpa.Repository;


import com.the33.SpringJpa.entity.Student;
import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public List<Student> findByFirstName(String firstName);

    public List<Student> findByFirstNameStartingWith(String name);

    @Query("Select s from Student s where s.mailId = ?1")
    public List<Student> findByEmailId(String mailId);

      @Query(
            value =
            "Select * FROM student_table s where s.relation = ?1",
            nativeQuery = true
    )
    List<Student> findByRelation(String father);


      @Modifying
      @Transactional
      @Query(value = "update student_table  set first_name = ?1 where last_name=?1",
              nativeQuery = true
      )
      int updateStudentNameByFirstName(String lastName,String firstName);
}





