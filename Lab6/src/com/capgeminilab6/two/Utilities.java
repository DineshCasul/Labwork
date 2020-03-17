package com.capgeminilab6.two;

public class Utilities {
	public static void AgeException(String age) throws AgeException {
		String pattern="[1-9]{1}[0-9]{1,3}";
		if(!age.matches(pattern)){
			throw new AgeException("Only numbers are allowed");
		}
		if(!(Integer.parseInt(age) > 15))
		{
			throw new AgeException("invalid age...Age must not be below 15...");	
		}
	}
}
