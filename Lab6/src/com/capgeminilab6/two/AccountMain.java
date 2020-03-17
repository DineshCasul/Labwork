package com.capgeminilab6.two;

import java.util.Scanner;

public class AccountMain {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	
	System.out.println("Enter the details for Smith");
	
	Account a1=new Account();
	Person p1=new Person();
	a1.setBalance(2000);
	String agee;
	while(true) {
		System.out.println("Enter the Age");
		agee =scr.next();
		try {
			Utilities.AgeException(agee);
			break;
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
	}
	p1.setAge(Float.parseFloat(agee));
	p1.setName("Smith");
	a1.deposit(2000);
	a1.getBal();
	a1.setAccNum();
	a1.setAccHolder(p1);

	System.out.println("Enter the details for Kathy");
	Account a=new Account();
	Person p=new Person();
	a.setBalance(3000);
	String age;
	while(true) {
		System.out.println("Enter the Age");
		age = scr.next();
		try {
			Utilities.AgeException(age);
			break;
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
	}
	p.setAge(Float.parseFloat(age));
	a.withdraw(2000);
	p.setName("Kathy");
	a.getBal();
	a.setAccNum();
	a.setAccHolder(p);
	System.out.println("Details for Smith "+ a1.toString());
	System.out.println("Details for kathy "+ a.toString());	
	}
}
