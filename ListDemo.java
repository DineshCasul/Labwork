package pack1;

import java.util.HashSet;

public class ListDemo {
	public static void main(String[] args) {
		/*List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1003,"raj",50000));
		empList.add(new Employee(1008,"ram",20000));
		empList.add(new Employee(1001,"neha",35000));
		for (Employee employee : empList) {
			System.out.println(employee.getEmpId());
		}
		Collections.sort(empList,new EmpNameComparator());
		for (Employee employee : empList) {
			System.out.println(employee.getEmpId());
		}*/
		//name of emp with highest salary
		//list of emp whose salary more than 30000
		
		
		/*List<String> strlist = new ArrayList<>();
		strlist.add("a");
		strlist.add("z");
		strlist.add("b");
		Collections.sort(strlist);
		System.out.println(strlist);
		*/
		//Collections.sort(empList);
		
		/*HashSet<String> set = new HashSet<>();
		set.add("aa");
		System.out.println(set.add("aa"));
		System.out.println(set.size());*/
		/*TreeSet<Employee> empset = new TreeSet<>();
		empset.add(new Employee(1005,"aa",34343));
		empset.add(new Employee(1002,"bb",33457));
		for (Employee employee : empset) {
			System.out.println(employee.getEmpId());
		}*/
		HashSet<Employee> empset = new HashSet<>();
		Employee e1 =new Employee(1001,"aa",34343);
		Employee e2=new Employee(1001,"aa",34343);
		empset.add(e1);
		empset.add(e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(empset.size());
		
		
	}

}
