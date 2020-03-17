package com.capgeminilab10.all;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PersonProp {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Properties p=new Properties();
		p.setProperty("EmpId", "12");
		p.setProperty("EmpName", "Sahil");
		p.setProperty("Salary","1000");
		p.setProperty("City","Haryana");
		
		
		FileOutputStream out=new FileOutputStream("PersonProp.properties");  //write
		p.store(out, "PersonProp stored");
		
		
		FileInputStream in=new FileInputStream("PersonProp.properties");  //read
		p.load(in);
	
		
		System.out.println(p.getProperty("EmpId"));
		System.out.println(p.getProperty("EmpName"));
		System.out.println(p.getProperty("Salary"));
		System.out.println(p.getProperty("City"));
		
		p.list(System.out);
	}
}
