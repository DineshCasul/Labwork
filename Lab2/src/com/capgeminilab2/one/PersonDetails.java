package com.capgeminilab2.one;

import java.util.Scanner;

public class PersonDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		int weight = sc.nextInt();
	
		Person p = new Person();
		
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setGender(gender);
		p.setAge(age);
		p.setWeight(weight);
		
		System.out.println("Person Details: \n_______________\n");
		System.out.println("First Name: " + p.getFirstName());
		System.out.println("Last Name: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());
		System.out.println("Age: " + p.getAge());
		System.out.println("Weight: " + p.getWeight());
		 
	}
}
