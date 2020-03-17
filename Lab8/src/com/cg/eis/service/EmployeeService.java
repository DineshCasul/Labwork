package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public void addEmployeeToFile(Employee e);
	public void displayEmployee(Employee e);
	public String getInsuranceScheme(int salary, String designation);
}
