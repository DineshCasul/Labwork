package com.cg.lab3;

import java.time.LocalDate;
import java.time.Period;

public class Expiration {
	private int month;
	private int year;
	private int mm;
	private int day;
	private int dd;
	private int yy;

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

	public String warranty(int day, int month, int year, int dd, int mm, int yy) {
		LocalDate PurchaseDate = LocalDate.of(year, month, 1);
		LocalDate WarrantyDate = LocalDate.of(yy, mm, 1);
		Period WarrDuration = Period.between( PurchaseDate,WarrantyDate);
		int years = WarrDuration.getYears();
		int months = WarrDuration.getMonths();
		return years + " year " + months + " month ";

	}
}
