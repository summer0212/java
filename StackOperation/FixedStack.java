package src.practice.StackOperation;


public class FixedStack implements Stack 
{
	
	private int topOfStack;
	private Customer[] customers;

	public FixedStack()
	{
		this.topOfStack=-1;
		this.customers=new Customer[STACK_SIZE];
	}
	
	private boolean isStackEmpty()
	{   
        if(topOfStack == -1)
            return true; 
        else 
            return false; 
	}
	
	private boolean isStackFull()
	{   
        if(topOfStack == customers.length-1)
            return true; 
        else 
            return false; 
	}

	public void push(Customer data)
	{	
		if(!isStackFull())
			customers[++topOfStack]= data;
		else
			System.out.println("Stack is full");	
	}

	public Customer pop()
	{
		if(isStackEmpty())
		{
			System.out.println("The stack is empty");
			return null;
		}
		
		Customer cust=customers[topOfStack];
		topOfStack--;
		return cust;
	}
}
