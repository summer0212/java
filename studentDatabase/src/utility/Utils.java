package utility;
import java.util.Collections;
import java.util.List;

import core.Student;
import custom_sort.Sort;

public class Utils 
{

	public static Student findHighestMarks(List<Student> sList)
	{
		Collections.sort(sList, new Sort());
		return sList.get(sList.size()-1);
	}
	
	public static double averageMarksOfAllStudents(List<Student> sList)
	{
		//int count=0;
		double sum=0;
		for(Student s : sList)
		{
			sum=sum+s.getMarks();
			//count++;
		}
		return sum/sList.size();
	}
	
//	public static boolean validateRollNumber(List<Student> sList,int rollNo) 
//	{
////		return sList.contains(rollNo);
//	}

}
