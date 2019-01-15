package com.cg.rest.Employee.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empId;
	private String employeeName;
	private double salary;
	
	@Embedded
	private Address address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int empId, String employeeName, double salary, Address address) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee() {
		
	}

	
}
