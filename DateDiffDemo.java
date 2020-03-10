package com.cg.lab3;

import java.util.Scanner;

public class DateDiffDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateDiff threepointthree = new DateDiff();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day : ");
		int days = scan.nextInt();
		System.out.println("Enter month : ");
		int months = scan.nextInt();
		System.out.println("Enter year : ");
		int years = scan.nextInt();
		
		System.out.println(threepointthree.duration(days, months, years));
		
		scan.close();
	}

}


