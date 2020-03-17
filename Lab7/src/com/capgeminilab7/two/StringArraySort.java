package com.capgeminilab7.two;

import java.util.ArrayList;
import java.util.Collections;
public class StringArraySort {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Fogg");
		al.add("Denver");
		al.add("Axe");
		al.add("Beardo");
		al.add("Ustraa");
		Collections.sort(al);
		for(String product:al) {
			System.out.println(product);
		}
	}
}
