package com.capgeminilab8.one;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class reversefiledata {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test1.txt");
			fos.write(0);
			fos.write('A');
			fos.write(120);
			fos.write(676);
			
		} finally {
			if(fos != null)
				fos.close();
		}
		System.out.println("Write Done");
		
		List<String> li = new LinkedList<String>();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test1.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		int value = fis.read();
		System.out.println("Reading after first write:");
		while(value != -1) {
			System.out.println(value);
			li.add(Integer.toString(value));
			value = fis.read();
		} 
		
		try {
			fos = new FileOutputStream("test1.txt");
			for(int i = li.size() - 1; i >=0; i--) {
				fos.write(Integer.parseInt(li.get(i)));
			}
			
		} finally {
			if(fos != null)
				fos.close();
		}
		System.out.println("Reverse Write Done");
		fos.close();
		
		try {
			fis = new FileInputStream("test1.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		int value1 = fis.read();
		System.out.println("Reading after reverse write:");
		while(value1 != -1) {
			System.out.println(value1);
			value1 = fis.read();
		} 
		fis.close();
	}
}
