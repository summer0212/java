package core;

public class Employee 
{
	private String name;
	private int empID;
	private double salary;
	private static int idGenerator=1;
	
	public Employee(String name,double salary)
	{
		empID=idGenerator++;
		this.name=name;
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public String toString()
	{
		return "Employee-ID"+empID+" "+"Employee name:"+" "+name+"Salary:"+" "+salary;
	}
}
