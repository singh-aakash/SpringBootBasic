package com.cg.rest.Employee.service;

import java.awt.List;

import com.cg.rest.Employee.Entity.Employee;

public interface EmployeeService {

	void addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
}