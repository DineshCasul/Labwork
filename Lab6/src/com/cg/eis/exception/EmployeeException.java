package com.cg.eis.exception;

public class EmployeeException extends Exception{
	String msg;
	public EmployeeException(String string) {
		// TODO Auto-generated constructor stub
		this.msg = string;
	}
	public String getMessage() {
		return this.msg;
	}
}
