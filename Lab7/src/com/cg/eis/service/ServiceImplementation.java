package com.cg.eis.service;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class ServiceImplementation implements EmployeeService{
	Map<String,Employee> l1 = new HashMap<String,Employee>();
	public void addEmployee(Employee emp) {
		l1.put(Integer.toString(emp.getEmpid()), emp); 
	}
	public boolean deleteEmployee(String id) {
		if(l1.containsKey(id)) {
			l1.remove(id);
			return true;
		}
		return false;
	}
	public void displaySortedEmployee() {
		List<Employee> bySalary = new LinkedList<>(l1.values());
		Collections.sort(bySalary, Comparator.comparing(Employee::getEmpSal));
		for (Employee b : bySalary) {
		    System.out.println(b.getEmpName() + "\t" + b.getEmpSal());
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
	public String getInsuranceScheme(String id) {
		// TODO Auto-generated method stub
		return l1.get(id).getInsuranceScheme();
	}
}
