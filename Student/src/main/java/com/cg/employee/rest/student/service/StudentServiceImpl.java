package com.cg.employee.rest.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employee.rest.student.entity.Student;
import com.cg.employee.rest.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	@Override
	public void addNewStudent(Student student) {
		repository.save(student);
		
	}

	@Override
	public List<Student> getAllStudents() {

		return repository.findAll();
	}

	@Override
	public void updateStudent(Student student) {
	
		repository.save(student);
	}

	@Override
	public void deleteStudent(int studentId) {
	
		Student student = repository.getOne(studentId);
		repository.delete(student);
		
	}

	@Override
	public Student getStudentById(int studentId) {
		return repository.findById(studentId).get();
	}
}
