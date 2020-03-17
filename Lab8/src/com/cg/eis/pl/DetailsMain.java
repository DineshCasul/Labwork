package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.exception.Utilities;
import com.cg.eis.service.ServiceImplementation;

public class DetailsMain{
	public static void main(String[] args) throws Exception {
		Scanner scr = new Scanner(System.in);
		String empId, empFirstName, empLastName, empSal, designation;
		System.out.println("Emp ID");
		empId = scr.next();
		System.out.println("Emp First Name");
		empFirstName = scr.next();
		System.out.println("Emp Last Name");
		empLastName = scr.next();
		while(true) {
			System.out.println("Emp Salary");
			empSal = scr.next();
			try {
				Utilities.salaryValidate(empSal);
				break;
			} catch (EmployeeException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Designation");
		designation = scr.next();
		ServiceImplementation e = new ServiceImplementation();
		String insuranceScheme = e.getInsuranceScheme(Integer.parseInt(empSal), designation);
		Employee emp = new Employee();
		emp.setEmpid(Integer.parseInt(empId));
		emp.setEmpFirstName(empFirstName);
		emp.setEmpLastName(empLastName);
		emp.setEmpSal(Integer.parseInt(empSal));
		e.addEmployeeToFile(emp);
		e.displayEmployee(emp);
		System.out.println("Scheme = " + insuranceScheme);
	}
}
