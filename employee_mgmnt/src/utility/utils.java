package utility;

import java.util.Collections;
import java.util.List;
import custom_excptn.*;
import core.Employee;
import core.SortAsPerSalary;

public class utils 
{
	public static Employee findHighestSalaryBySorting(List<Employee> e)//Using sorting and complexity=O(n)
	{
		Collections.sort( e, new SortAsPerSalary());
		return e.get(0);
		
	}
	
	public static Employee findHighestSalaryBySearching(List<Employee> e)
	{
		//boolean found=false;
		double maxSalary=e.get(0).getSalary();
		Employee maxSalaryEmp=e.get(0);
		for(Employee emp:e)
		{
			if(emp.getSalary()>maxSalary)
			{
				maxSalary=emp.getSalary();
				maxSalaryEmp=emp;
			}
		}
		return maxSalaryEmp;
	}
	
	public static double totalExpenditureOnSalary(List<Employee> e)
	{
		double totalExp=0;
		for(Employee emp:e)
		{
			totalExp=totalExp+emp.getSalary();
		}
		return totalExp;
	}
	
	public static boolean validateEmployeeid(List<Employee> e,int id)
	{
		return e.contains(id);
	}
}
