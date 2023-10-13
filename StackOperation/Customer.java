package src.practice.StackOperation;

public class Customer 
{
	private int id;
	private String name;
	private String address;
	
	public Customer(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;	
	}
	public Customer()
	{

	}
	
	public String toString()
	{
		return id+" "+name+" "+address+" ";
		
	}
	
	

}
