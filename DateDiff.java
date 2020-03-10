package com.cg.lab3;

import java.time.LocalDate;
import java.time.Period;

public class DateDiff {

	private int day;
	private int month;
	private int year;

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

	public String duration(int day, int month, int year) {

		LocalDate todayDate = LocalDate.now();
		LocalDate userDate = LocalDate.of(year, month, day);

		Period age = Period.between(userDate, todayDate);
		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getDays();

		return years + " years " + months + " months " + days + " days";
	}
}
