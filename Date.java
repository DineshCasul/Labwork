package com.cg.lab3;

import java.time.LocalDate;
import java.time.Period;

public class Date {
	private int Day;
	private int month;
	private int year;
	private int dd;
	private int mm;
	private int yy;

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
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

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	public String duration(int day, int month, int year, int dd, int mm, int yy) {
		LocalDate UserDate1 = LocalDate.of(year, month, day);
		LocalDate UserDate2 = LocalDate.of(yy, mm, dd);
		Period age = Period.between(UserDate2, UserDate1);
		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getDays();

		return years + " years " + months + " months " + days + " days ";
	}
}
