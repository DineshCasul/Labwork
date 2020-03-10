package com.cg.lab3;

import java.time.LocalDate;
import java.time.Period;

public class PersonAge {
	private String firstName;
	private String lastName;
	private char gender;
	private long phoneno;
	private int day;
	private int month;
	private int year;
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
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
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
	public String CalculateAge(int day,int month,int year) {
		LocalDate todaydate= LocalDate.now();
		LocalDate UserDate= LocalDate.of(year, month, day);
		Period age=Period.between(UserDate,todaydate);
		int years=age.getYears();
		int months=age.getMonths();
		int days=age.getDays();
		return years+" years "+ months+" months "+ days+ " days ";
		
	}
   public String getFullName(String firstName,String lastName ) {
	   String FullName= firstName+" " + lastName;
	   return FullName;
   }
}
