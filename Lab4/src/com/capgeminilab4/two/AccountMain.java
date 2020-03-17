package com.capgeminilab4.two;

import java.util.Scanner;

import com.capgeminilab4.one.Account;
import com.capgeminilab4.one.Person;

public class AccountMain {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	
	System.out.println("Enter the details for Smith");
	System.out.println("Enter the Age");
	String agee=scr.next();
	Account a1=new Account();
	Person p1=new Person();
	a1.setBalance(2000);
	p1.setAge(Float.parseFloat(agee));
	p1.setName("Smith");
	a1.deposit(2000);
	a1.getBal();
	a1.setAccNum();
	a1.setAccHolder(p1);

	System.out.println("Enter the details for Kathy");
	System.out.println("Enter the Age");
	String age=scr.next();
	Account a=new Account();
	Person p=new Person();
	a.setBalance(3000);
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
