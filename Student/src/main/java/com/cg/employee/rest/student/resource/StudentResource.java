package com.cg.employee.rest.student.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.rest.student.entity.Student;
import com.cg.employee.rest.student.service.StudentService;


@RestController
@RequestMapping("/students") // Addressable Resource
public class StudentResource {

	@Autowired
	private StudentService service;

	@PostMapping
	public void addNewEmployee(@RequestBody Student student) {
		service.addNewStudent(student);
	}

	@GetMapping// Uniform Constraint
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}
	
	@PutMapping
	public void updateStudent(@RequestBody Student student) {
		service.updateStudent(student);
	}
	
	@DeleteMapping("/{studentId}")
	public void updateStudent(@PathVariable int studentId) {
		service.deleteStudent(studentId);
	}
	
	@GetMapping("/{studentId}")
	public Student getStudentById(@PathVariable int studentId) {
		return service.getStudentById(studentId);
	}
}