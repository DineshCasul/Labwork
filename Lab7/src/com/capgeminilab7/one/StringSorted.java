package com.capgeminilab7.one;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorted {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of product");
		int count=sc.nextInt();
		String[] str=new String[count];
		System.out.println("enter your product name");
		for(int i=0;i<count;i++) {
			str[i]=sc.next();
		}
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
