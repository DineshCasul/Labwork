package com.capgeminilab3.two;
import java.util.Scanner;

public class threePointTwoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threePointTwo ps = new threePointTwo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scan.next();
		System.out.println(ps.positiveString(input));
		scan.close();
	}

}
