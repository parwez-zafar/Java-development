package com.parwez.spring_data_jpa_ex;

import com.parwez.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1= context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		StudentRepo repo=context.getBean(StudentRepo.class);

//		s1.setRollNo(101);
//		s1.setName("Navin");
//		s1.setMarks(75);
//
//
		s2.setRollNo(102);
		s2.setName("Kiran");
		s2.setMarks(65);
//
//
//		s3.setRollNo(103);
//		s3.setName("Harsh");
//		s3.setMarks(70);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);


		System.out.println(repo.findAll());

		System.out.println(repo.findById(103));


		// find by name(other than primary key)
		System.out.println(repo.findByMarksGreaterThan(72));


		// update and delete

		System.out.println(repo.save(s2));
		repo.delete(s2);


	}

}