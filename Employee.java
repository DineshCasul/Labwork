0package pack1;

public class Employee implements Comparable{
	private Integer empId;
	private String empName;
	private Integer salary;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, Integer salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee emp = (Employee)o;
		/*if(this.empId==emp.empId)
			return 0;
		else if(this.empId>emp.empId)
			return 1;
		else
			return -1;*/
		return this.empId.compareTo(emp.empId);
	}
	public boolean equals(Object o){
		Employee e = (Employee)o;
		if(this.getEmpId().equals(e.getEmpId()))
			return true;
		else
			return false;
	}
	public int hashCode(){
		return this.getEmpId();
	}
	

}
