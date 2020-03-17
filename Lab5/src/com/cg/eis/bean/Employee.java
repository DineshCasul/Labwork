package com.cg.eis.bean;

public class Employee{
	private int empid;
	private float empSal = 0;
	private String empFirstName, empLastName, designation, insuranceScheme;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpName() {
		return this.empFirstName + " " + this.empLastName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empSal=" + empSal + ", Name=" + empFirstName + " "
				+ empLastName + ", designation=" + designation + ", insuranceScheme=" + insuranceScheme + "]";
	}
}
