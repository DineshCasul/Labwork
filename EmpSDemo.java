package pack1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;



public class EmpSDemo {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1003,"raj",50000));
		empList.add(new Employee(1008,"ram",20000));
		empList.add(new Employee(1001,"neha",35000));
		
		Stream<Employee> empStream=empList.stream();
	//	empStream.forEach((a)->	System.out.println(a.getEmpId()));
		
/*		Stream<Employee> es=empStream.filter((a)->a.getSalary()>20000);
		es.forEach((a)->System.out.println(a.getEmpName()));
		*/
		
		//empStream.filter((a)->a.getSalary()>20000).forEach((a)->System.out.println(a.getEmpName()));
		//empStream.map((a)->a.getSalary()+1000).forEach(System.out::println);
		
		//Consumer c = 
		
		//Optional<Integer>op=empStream.map((a)->a.getSalary()).reduce((a,b)->a+b);
		//System.out.println(op.get());
		
		//empStream.sorted((a,b)->a.getSalary().compareTo(b.getSalary())).forEach((a)->System.out.println(a.getEmpId()));
		
		
		empStream.sorted(Comparator.comparing(Employee::getSalary)).forEach((a)->System.out.println(a.getEmpId()));
		
		
	
		
		
		
		
		
		/*empStream.sorted((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName())).forEach(System.out::println);
		empStream.sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);
		*/
		
		
		
		
		
		
	}

}
