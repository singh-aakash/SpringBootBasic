package com.cg.rest.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.rest.Employee.Entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public void addNewEmployee(Employee employee) {
		
	}

}
