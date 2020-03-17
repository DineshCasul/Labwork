package com.capgeminilab3.five;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class threePointFive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Product purchase date : ");
		System.out.println("Enter day : ");
		int days = scan.nextInt();
		System.out.println("Enter month : ");
		int months = scan.nextInt();
		System.out.println("Enter year : ");
		int years = scan.nextInt();
		System.out.println("Warrantee period (in terms of months and years) : ");
		System.out.println("Enter month : ");
		int monthsSecond = scan.nextInt();
		System.out.println("Enter year : ");
		int yearsSecond = scan.nextInt();
		System.out.println(duration(days,months,years,monthsSecond,yearsSecond));
	}
	public static String duration(int days, int months, int years, int monthsSecond, int yearsSecond) {
		int wYears = years + yearsSecond;
		int wMonths = months + monthsSecond;
		LocalDate userDate = LocalDate.of(wYears, wMonths, days);
		LocalDate todayDate = LocalDate.now();
		Period duration = Period.between(todayDate, userDate);
		if(duration.isNegative()) return "Expired on " + userDate;
		return "Expires on " + userDate;
	}
}
