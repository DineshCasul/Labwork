package com.cg.eis.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cg.eis.bean.Employee;

public class ServiceImplementation implements EmployeeService{
	public void addEmployeeToFile(Employee e) {
		try {
			FileOutputStream fout = new FileOutputStream("test3.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(e);
		} catch (Exception ex) {
		    System.err.println("failed to write " + "test3.txt" + ", "+ ex);
		}
	}
	public void displayEmployee(Employee e) {
		try {
		    FileInputStream file = new FileInputStream("test3.txt");
		    ObjectInputStream reader = new ObjectInputStream(file);
		    try { 
		        Employee obj = (Employee)reader.readObject();
		        System.out.println(obj);
		    } catch (Exception ex) {
		        System.err.println("end of reader file ");
		    }
		} catch (Exception ex) {
		    System.err.println("failed to read " + "test3.txt" + ", "+ ex);
		}
	}
	@Override
	public String getInsuranceScheme(int salary, String designation) {
		if(salary > 5000 && salary < 20000 && designation.equals("System Associate")) {
			return "Scheme C";
		}
		else if(salary >= 20000 && salary < 40000 && designation.equals("Programmer")) {
			return "Scheme B";
		}
		else if(salary >= 40000 && designation.equals("Manager")){
			return "Scheme A";
		}
		else if(salary < 5000 && designation.equals("Clerk")){
			return "No Scheme";
		}
		return "Data Incorrect";
	}
}
