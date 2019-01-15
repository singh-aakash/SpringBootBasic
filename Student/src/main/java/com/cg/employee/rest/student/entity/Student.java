package com.cg.employee.rest.student.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String batch;
	
	@Embedded
	private Address address;

	public Student() {
		
	}
	


	public Student(int studentId, String studentName, String batch, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.batch = batch;
		this.address = address;
	}



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
