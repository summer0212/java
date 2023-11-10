package custom_sort;

import java.util.Comparator;

import core.Student;

public class Sort implements Comparator<Student>
{
	@Override
	public int compare(Student ob1, Student ob2)
	{
		if(ob1.getMarks()>ob2.getMarks())
			return 1;
		else if(ob1.getMarks()<ob2.getMarks())
			return -1;
		return 0;	
	}		
	

}
