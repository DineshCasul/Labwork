package com.capgeminilab8.two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class delimiterSplitRead {
	public static void main(String[] args) {
		String[] tokens = null;
		try(BufferedReader in = new BufferedReader(new FileReader("test1.txt"))) {
		    String str;
		    while ((str = in.readLine()) != null) {
		    	tokens = str.split(",");
		        System.out.println(str);
		    }
		}
		catch (IOException e) {
		    System.out.println("File Read Error");
		}
		System.out.println("Displaying only even numbers: ");
		for(String s: tokens) {
			if((Integer.parseInt(s) % 2) == 0)
				System.out.println(s);
		}
	}
}
