package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public void addEmployee(Employee emp);
	public boolean deleteEmployee(String id);
	public void displaySortedEmployee();
	public String getInsuranceScheme(int salary, String designation);
}
