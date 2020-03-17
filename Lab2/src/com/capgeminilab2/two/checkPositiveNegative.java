package com.capgeminilab2.two;

public class checkPositiveNegative {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if(n >= 0) {
			System.out.println("Positive Number");
		}
		else {
			System.out.println("Negative Number");
		}
	}
}
