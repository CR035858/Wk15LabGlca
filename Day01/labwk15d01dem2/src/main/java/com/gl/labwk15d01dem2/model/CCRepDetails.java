package com.gl.labwk15d01dem2.model;

public class CCRepDetails {
	
	String firstName;
	String lastName;
	String address;
	String department;
	String designation;
	
	public CCRepDetails() {
		super();
	}

	public CCRepDetails(String firstName, String lastName, String address, String department, String designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.department = department;
		this.designation = designation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "CCRepDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", department=" + department + ", designation=" + designation + "]";
	}
	
	
	

}
