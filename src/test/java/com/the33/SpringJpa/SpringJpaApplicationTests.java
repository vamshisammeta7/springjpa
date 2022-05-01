package com.the33.SpringJpa;

import com.the33.SpringJpa.Repository.StudentRepository;
import com.the33.SpringJpa.entity.Gaurdian;
import com.the33.SpringJpa.entity.Student;
import org.hibernate.sql.Select;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@SpringBootTest
class SpringJpaApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void saveStudent() {


		Gaurdian gaurdian = Gaurdian.builder()
				.name("raghu").relation("father").build();

		Student student = Student.builder()
				.firstName("vivek")
				.lastName("bhupathi")
				.mailId("nk@gmail.com")
				.gaurdian(gaurdian)
				.build();
		studentRepository.save(student);

	}

	@Test
	public void getStudents() {

		List<Student> studentList = studentRepository.findAll();
		System.out.println(studentList);
	}

	@Test
	public void getStudentsWithFirstName() {

		List<Student> StudentList = studentRepository.findByFirstName("vamshi");
		System.out.println("studentwithfirstNm" + StudentList);
	}

	@Test
	public void getStudentWith() {

		List<Student> students = studentRepository.findByFirstNameStartingWith("v");

		System.out.println("studentwithfirstNm" + students);
	}

	@Test
	public void getStudentWithMailId() {

		List<Student> students = studentRepository.findByEmailId("vk@gmail.com");
		System.out.println("studentswithmailid=" + students);

	}

	@Test
	public void getStudentsWithRelation() {

		List<Student> student = studentRepository.findByRelation("father");
		System.out.println("xxxx" + student);

	}

	@Test
	public void updateStudentName(){

		studentRepository.updateStudentNameByFirstName("vamshi","krishna");
	}
}








