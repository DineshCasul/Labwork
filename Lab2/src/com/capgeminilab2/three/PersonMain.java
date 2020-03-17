package com.capgeminilab2.three;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		char gender = sc.next().charAt(0);
	
		Person p = new Person(firstName, lastName, gender);
		
		System.out.println("Person Details: \n_______________\n");
		System.out.println("First Name: " + p.getFirstName());
		System.out.println("Last Name: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());
		
	}
}
