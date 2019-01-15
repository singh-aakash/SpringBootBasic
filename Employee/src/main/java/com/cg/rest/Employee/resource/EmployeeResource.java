package com.cg.rest.Employee.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.Employee.Entity.Employee;
import com.cg.rest.Employee.service.EmployeeService;

@RestController
@RequestMapping("/employees") // Addressable Resource
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	@GetMapping// Uniform Constraint
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

}
