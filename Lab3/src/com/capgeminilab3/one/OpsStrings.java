package com.capgeminilab3.one;
import java.util.Scanner;

public class OpsStrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringInput string = new stringInput();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose a option :  \n" +
				"1. Add the String to itself\r\n" + 
				"2. Replace odd positions with #\n" + 
				"3. Remove duplicate characters in the String\n" + 
				"4. Change odd characters to upper case\n" + 
				"5. Exit\n");
		int option = scan.nextInt();
		switch(option) {
		case 1:	
			System.out.println("Enter a string : ");
			String name = scan.next();
			System.out.println(string.stringAdd(name));
			break;
		case 2:
			System.out.println("Enter a string : ");
			String oddName = scan.next();
			string.oddPosition(oddName);
			break;
		case 3:
			System.out.println("Enter a string : ");
			String duplicate = scan.next();
			System.out.println(string.duplicateString(duplicate));
			break;
		case 4:
			System.out.println("Enter a string : ");
			String upperCase = scan.next();
			System.out.println(string.upperCase(upperCase));
			break;
		case 5:
			System.exit(1);
			default:
		}
		scan.close();
	}
}
