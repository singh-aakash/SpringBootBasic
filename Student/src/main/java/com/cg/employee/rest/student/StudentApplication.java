package com.cg.employee.rest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.employee.rest.student.entity.Address;
import com.cg.employee.rest.student.entity.Student;
import com.cg.employee.rest.student.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(StudentRepository repository) {
		return (arg) -> {
			repository.save(new Student(109,"Satyen", "CSE", new Address("Delhi", 226016, "up")));
			repository.save(new Student(107,"Aakash", "CSE", new Address("Lucknow", 226026, "up")));
			repository.save(new Student(106,"Shiv", "IT", new Address("Delhi", 226036, "up")));
			repository.save(new Student(105,"Saket", "ME", new Address("Kanpur", 226056, "up")));
			repository.save(new Student(104,"Varun", "CIVIL", new Address("Delhi", 226066, "up")));
			repository.save(new Student(103,"Badi", "CSE", new Address("Allhabad", 226076, "up")));
			repository.save(new Student(102,"Pin", "ME", new Address("Delhi", 226086, "up")));
			repository.save(new Student(101,"Satyen", "CIVIL", new Address("Itawa", 226096, "up")));
			
		};
	}
}

