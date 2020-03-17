package com.capgeminilab6.one;

import java.io.IOException;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String firstName, lastName;
		char gender;
		while(true) {
			try {
				firstName = sc.nextLine();
				Utilities.nameValidate(firstName);
				break;
			} catch (NameException e) {
				System.out.println(e.getMessage());
			}
		}
		while(true) {
			try {
				lastName = sc.nextLine();
				Utilities.nameValidate(lastName);
				break;
			} catch (NameException e) {
				System.out.println(e.getMessage());
			}
		}
		gender = sc.next().charAt(0);
	
		Person p = new Person(firstName, lastName, gender);
		
		System.out.println("Person Details: \n_______________\n");
		System.out.println("First Name: " + p.getFirstName());
		System.out.println("Last Name: " + p.getLastName());
		System.out.println("Gender: " + p.getGender());
		
	}
}
