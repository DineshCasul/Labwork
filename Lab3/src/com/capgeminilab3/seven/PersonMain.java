package com.capgeminilab3.seven;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		char gender = sc.next().charAt(0);
		System.out.println("enter the day ");
		int day = sc.nextInt();
		System.out.println("enter the month ");
		int month = sc.nextInt();
		System.out.println("enter the year");
		int year = sc.nextInt();
	
		Person p = new Person(firstName, lastName, gender, day, month, year);
		
		System.out.println("Person Details: \n_______________\n");
		System.out.println("Name: " + p.getFullName());
		System.out.println("Age: " + p.calculateAge());
	}
}
