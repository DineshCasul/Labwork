package com.capgeminilab3.seven;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	private int day;
	private int month;
	private int year;
	
	public Person() {
		this.firstName = null;
		this.lastName = null;
		this.gender = '\0';
	}
	public Person(String firstName, String lastName, char gender, int day, int month, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.day = day;
		this.month = month;
		this.year = year;
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
	public String getFullName(){
		return this.firstName + " " + this.lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	public String calculateAge() {
		LocalDate todayDate = LocalDate.now();
		LocalDate userInput = LocalDate.of(year, month, day);
		Period pe = Period.between(userInput, todayDate);
		int dy = pe.getDays();
		int mo = pe.getMonths();
		int yr = pe.getYears();
		return yr + " years " + mo + " months " + dy + " days";
	}
}
