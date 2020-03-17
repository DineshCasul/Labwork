package com.capgeminilab3.four;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class threePointFour {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first date : ");
		System.out.println("Enter day : ");
		int days = scan.nextInt();
		System.out.println("Enter month : ");
		int months = scan.nextInt();
		System.out.println("Enter year : ");
		int years = scan.nextInt();
		System.out.println("Enter second date : ");
		System.out.println("Enter day : ");
		int daysSecond = scan.nextInt();
		System.out.println("Enter month : ");
		int monthsSecond = scan.nextInt();
		System.out.println("Enter year : ");
		int yearsSecond = scan.nextInt();
		System.out.println(duration(days,months,years,daysSecond,monthsSecond,yearsSecond));
		scan.close();
	}

	public static String duration(int days, int months, int years, int daysSecond, int monthsSecond, int yearsSecond) {
		LocalDate userDate = LocalDate.of(years, months, days);
		LocalDate userDateSecond = LocalDate.of(yearsSecond, monthsSecond, daysSecond);
		Period duration = Period.between(userDate,userDateSecond);
		int yearDuration = duration.getYears();
		int monthDuration = duration.getMonths();
		int dayDuration = duration.getDays();
		return yearDuration + " years " +monthDuration + " months " + dayDuration + " days";
	}
}
