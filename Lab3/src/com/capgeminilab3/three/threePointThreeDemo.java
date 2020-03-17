package com.capgeminilab3.three;
import java.util.Scanner;

public class threePointThreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threePointThree t = new threePointThree();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day : ");
		int days = scan.nextInt();
		System.out.println("Enter month : ");
		int months = scan.nextInt();
		System.out.println("Enter year : ");
		int years = scan.nextInt();
		System.out.println(t.duration(days, months, years));
		scan.close();
	}
}
