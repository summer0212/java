package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utility.utils.*;
import core.Employee;
import custom_excptn.CustomException;

public class Main {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Kailash", 23000));
		list.add(new Employee("Sahil", 32000));
		list.add(new Employee("Ram", 54000));
		list.add(new Employee("Sona", 20000));
		list.add(new Employee("Sonam", 22000));
		System.out.println("Enter your choice where 1.Emp with highest salary 2.total expenditure of company in salary   3.update the salary  4.EXIT");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1://Emp with highest salary
			 
			System.out.println("The employe with highest salary using sorting");
			Employee empBySorting=findHighestSalaryBySorting(list);
			System.out.println(empBySorting);
			System.out.println("The employe with highest salary using sorting");
			Employee empBySearching=findHighestSalaryBySearching(list);
			System.out.println(empBySearching);
			break;
			
		case 2://total expenditure of company in salary
			double totalExpenditureByComapny=totalExpenditureOnSalary(list);
			System.out.println(totalExpenditureByComapny);
			break;
			
		case 3://update the salary for given employee id
			System.out.println("Enter the ID for which you want the salary detail");
			int id=sc.nextInt();
			System.out.println("Enter the new salary for the employe with given id");
			double newSalary=sc.nextDouble();
			if(!validateEmployeeid(list,id))
			{
				System.out.println("The entered id is not valid!!");
			}
			else
			{
				Employee emp=list.get(id);
				emp.setSalary(newSalary);
				System.out.println("The new salary for emplyee id:"+id+" "+"is"+emp.getSalary());
			}
			
		}
	}

}
