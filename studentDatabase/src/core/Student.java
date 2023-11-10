package core;

public class Student 
{
	private String name;
	private int rollNumber;
	private double marks;
	private static int rollGenerator=1;
	
	public Student(String name,double marks)
	{
		rollNumber=rollGenerator++;
		this.name=name;
		this.marks=marks;
	}
	public Student()
	{
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getMarks()
	{
		return this.marks;
	}
	
	public void setName(String newName)
	{
		this.name=newName;
	}
	
	public int getRollNumber()
	{
		return this.rollNumber;
	}
	
	public String toString()
	{
		return "Roll Number: "+" "+rollNumber+ "Name: "+name+" "+"Marks: "+marks;
	}

//	@Override
//	public int compareTo(Student o) {
//		
//		
//		
//	}
}
