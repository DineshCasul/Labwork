package com.capgeminilab6.one;

import java.io.IOException;

import com.cg.eis.exception.EmployeeException;

public class Utilities {
		
	public static void nameValidate(String name) throws NameException {
		String pattern="[a-zA-Z]{1,10}";
		if(name.equals("") || name.equals(" "))
			throw new NameException("The name cannot be blank");
		if(!name.matches(pattern))
			throw new NameException("Only Characters are allowed");	
	}

	public static void salaryValidate(String empSal) throws EmployeeException{
		// TODO Auto-generated method stub
		if(!(Integer.parseInt(empSal) > 3000))
			throw new EmployeeException("Salary less than 3000");
	}
}
