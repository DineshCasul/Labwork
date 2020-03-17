package com.capgeminilab2.four;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		char gender = sc.next().charAt(0);
		String phoneno = sc.next();
	
		Person p = new Person(firstName, lastName, gender, phoneno);
		System.out.println(p.displayDetails());
	}
}
