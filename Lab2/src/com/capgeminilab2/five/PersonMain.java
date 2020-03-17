package com.capgeminilab2.five;

import java.util.Scanner;

enum Gender{
	M,F;
}

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		String gender;
		boolean flag = true;
		do {
			System.out.println("Please enter M or F:");
			gender = sc.next();
			if(gender.charAt(0) == Gender.M.toString().charAt(0) || gender.charAt(0) == Gender.F.toString().charAt(0))
				flag = false;
		} while(flag);
		
		String phoneno = sc.next();
	
		Person p = new Person(firstName, lastName, gender.charAt(0), phoneno);
		System.out.println(p.displayDetails());
	}
}
