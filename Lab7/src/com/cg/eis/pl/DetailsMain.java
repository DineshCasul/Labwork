package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.ServiceImplementation;

public class DetailsMain{
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String empId, empFirstName, empLastName, empSal, designation;
		Employee emp;
		ServiceImplementation e = new ServiceImplementation();
		while(true) {
		System.out.println("1. Add Employee \n2.Get Insurance Scheme \n3.Delete Employee \n4.Display Sorted employee details based on salary \n5.Exit");
		int option = scr.nextInt();
		switch(option) {
		case 1:
			System.out.println("Emp ID");
			empId = scr.next();
			System.out.println("Emp First Name");
			empFirstName = scr.next();
			System.out.println("Emp Last Name");
			empLastName = scr.next();
			System.out.println("Emp Salary");
			empSal = scr.next();
			System.out.println("Designation");
			designation = scr.next();
			String insuranceScheme = e.getInsuranceScheme(Integer.parseInt(empSal), designation);
			emp = new Employee();
			emp.setEmpid(Integer.parseInt(empId));
			emp.setEmpFirstName(empFirstName);
			emp.setEmpLastName(empLastName);
			emp.setEmpSal(Integer.parseInt(empSal));
			emp.setDesignation(designation);
			emp.setInsuranceScheme(insuranceScheme);
			
			e.addEmployee(emp);
			break;
		case 2:
			System.out.println("Emp ID");
			empId = scr.next();
			System.out.println(e.getInsuranceScheme(empId));
			break;
		case 3:
			System.out.println("Emp ID");
			empId = scr.next();
			System.out.println(e.deleteEmployee(empId));
			break;
		case 4:
			e.displaySortedEmployee();
			break;
		case 5: System.exit(1);
		default:System.out.println("Please select from the available options");
		}
		}
	}
}
