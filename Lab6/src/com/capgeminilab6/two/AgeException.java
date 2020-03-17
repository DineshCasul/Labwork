package com.capgeminilab6.two;

public class AgeException extends Exception {
	String msg;
	public AgeException(String string){
		this.msg = string;
	}
	public String getMessage() {
		return this.msg;
	}
}