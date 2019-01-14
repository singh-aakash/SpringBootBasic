package com.cg.rest.Employee.resource;R

import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.employeeEntity.Employee;

@RestController
@RequestMapping("/employees") // Addressable Resource
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	@GetMapping// Uniform Contraint
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
}
