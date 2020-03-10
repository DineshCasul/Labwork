package com.cg.lab3;

import java.util.Scanner;

public class DateDemo {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter day : ");
		int day = scr.nextInt();
		System.out.println("Enter month : ");
		int month = scr.nextInt();
		System.out.println("Enter year : ");
		int year = scr.nextInt();
		System.out.println("Enter day : ");
		int dd = scr.nextInt();
		System.out.println("Enter month : ");
		int mm = scr.nextInt();
		System.out.println("Enter year : ");
		int yy = scr.nextInt();

		Date d = new Date();
		System.out.println(d.duration(day, month, year, dd, mm, yy));
		scr.close();

	}
}
