package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utility.*;
import static utility.Utils.*;
import core.Student;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		//Arraylist
		List<Student> list=new ArrayList<Student>();
//		String name=sc.next();
//		double marks=sc.nextDouble();
		Student students =new Student();
		///list.add(students);//list me student ka array store kr rhe
		//list.add(new Student(name, marks));
		list.add(new Student("Aman", 80.7));
		list.add(new Student("Rishi", 56));
		list.add(new Student("Anay", 67.7));
		list.add(new Student("Ram", 89));
		Student studentWithHighestMarks=findHighestMarks(list);
		System.out.println("The student with highest marks is:"+studentWithHighestMarks);
		double avgMarksOfAllStudents=averageMarksOfAllStudents(list);
		System.out.println("The avg marks of all students is:"+avgMarksOfAllStudents);
//		while()
//		{
		System.out.println("Enter the roll number for which you want all the details");
		int roll=sc.nextInt();
		boolean found=false;
		for(Student s : list)
		{
			if(s.getRollNumber()==roll)
			{
				found=true;
				System.out.println("Data for roll number " + roll + ": " + s.getName()+" "+s.getMarks());
				break;
			}
			
		}
		
		if(!found)
		{
			System.out.println("The entered roll number does not exist.");
		}
			
	}

}
