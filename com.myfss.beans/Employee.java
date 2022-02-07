package com.myfss.Beans;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String dob;
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	public Employee(int employeeId,String firstName,String lastName,String phoneNumber,String email,String dob,String address)
	{
		  this.employeeId = employeeId;
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.email = email;
		  this.phoneNumber = phoneNumber;
		  this.dob = dob;
		  this.address = address;
		}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", dob=" + dob
				+ ", address=" + address + "]";
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
