package com.cg.employee.rest.student.service;

import java.util.List;
import java.util.Optional;

import com.cg.employee.rest.student.entity.Student;

public interface StudentService {

	void addNewStudent(Student student);
	
	List<Student> getAllStudents();

	void updateStudent(Student student);

	void deleteStudent(int studentId);

	Student getStudentById(int studentId);
}