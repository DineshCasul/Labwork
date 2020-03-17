package com.capgeminilab6.one;

public class NameException extends Exception {
	String msg;
	public NameException(String string) {
		// TODO Auto-generated constructor stub
		this.msg = string;
	}
	public String getMessage() {
		return this.msg;
	}
}
