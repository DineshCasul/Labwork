package pack1;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		/*if(e1.getSalary()==e2.getSalary())
			return 0;
		else if(e1.getSalary()>e2.getSalary())
			return 1;
		else
			return -1;*/
		
		return e1.getSalary().compareTo(e2.getSalary());
	}

}
