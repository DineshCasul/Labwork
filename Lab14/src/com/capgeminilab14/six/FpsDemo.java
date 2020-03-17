package com.capgeminilab14.six;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FpsDemo 
{
	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "potato" ,29000));
		list.add(new Employee(1, "pie" ,26000));
		list.add(new Employee(1, "orange" ,25000));
		list.add(new Employee(1, "banana" ,24000));
		list.add(new Employee(1, "apple" ,23000));
		
		Double list1 =list.stream().map((a)-> a.getSal()).reduce((a,b) -> a+b).get();
		System.out.println(list1);
	
	}
	
	
	
}
