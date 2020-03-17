package com.capgeminilab14.three;

@FunctionalInterface
interface UserNamePasswordAuth{
	boolean auth(String username,String password);
}
public class UsernamePassword 
{
	public static void main(String[] args)
	{
		UserNamePasswordAuth usernamePasswordAuth=(u,p)->u.equalsIgnoreCase("apple")&&
		p.equalsIgnoreCase("password@123");
		System.out.println(usernamePasswordAuth.auth("orange", "password"));
		System.out.println(usernamePasswordAuth.auth("apple", "password@123"));
		
		
	}

}
