package src.practice.StackOperation;

import java.util.ArrayList;

public class GrowableStack implements Stack
{
    private int topOfStack;
	private ArrayList<Customer> customers;

    GrowableStack()
    {
        topOfStack=-1;
        customers=new ArrayList<>();
    }
    private boolean isStackEmpty()
	{   
        if(topOfStack == -1)
            return true; 
        else 
            return false; 
	}
    
    public void push(Customer data)
	{
        customers.add(++topOfStack,data);
	}

	public Customer pop()
	{
		if(isStackEmpty())
		{
			System.out.println("The stack is empty");
			return null;
		}
		
		Customer cust=customers.get(topOfStack);
		topOfStack--;
		return cust;
	}
}
