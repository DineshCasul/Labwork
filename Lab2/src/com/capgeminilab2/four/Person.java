package com.capgeminilab2.four;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	private String phoneNo;
	
	public Person() {
		this.firstName = null;
		this.lastName = null;
		this.gender = '\0';
		this.phoneNo = null;
	}
	public Person(String firstName, String lastName, char gender, String phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNo = phoneNo;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}	
	public String displayDetails() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", phoneNo="
				+ phoneNo + "]";
	}

	
}
