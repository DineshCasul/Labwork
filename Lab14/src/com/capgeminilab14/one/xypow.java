package com.capgeminilab14.one;

@FunctionalInterface

 interface Powerlambda 
 {
double compute(double x,double y);
}

public class xypow{
	public static void main(String[] args) {
		Powerlambda p=Math::pow;
		System.out.println(p.compute(2,4));
	}
}

