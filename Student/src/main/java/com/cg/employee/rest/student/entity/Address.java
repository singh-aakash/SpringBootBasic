package com.cg.employee.rest.student.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;
	private int pincode;
	private String state;
	

	
	public Address() {
	
	}
	public Address(String city, int pincode, String state) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
