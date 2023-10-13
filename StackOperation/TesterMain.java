package src.practice.StackOperation;
import java.util.Scanner;

public class TesterMain {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Stack stk= new FixedStack();
		boolean menuFlag=false;
		boolean stackChosen=false;
		while(!menuFlag)
		{
			System.out.println("enter your choice");
			System.out.println("1. Choose Fixed Stack");
			System.out.println("2. Choose Growable Stack");
			System.out.println("3. Push Data");
			System.out.println("4. Pop Data and display ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(stackChosen)
					{
						System.out.println("Cannot select a stack again");
					}
					else
					{
						stackChosen=true;
					}	
					break;

				case 2:
					if(stackChosen)
					{
						System.out.println("Cannot select a stack again");
					}
					else
					{
						stackChosen=true;
						stk = new GrowableStack();
					}
					break;

				case 3:
					if(!stackChosen)
					{
						System.out.println("No stack chosen");
						break;
					}
					System.out.println("Enter the user details-> id,name,adress");
					int id = sc.nextInt();
					sc.nextLine();
					String name = sc.nextLine();
					String address= sc.nextLine(); 

					Customer customer=new Customer(id,name,address);
					stk.push(customer);
					break;

				case 4:
					if(!stackChosen)
					{
						System.out.println("No stack chosen");
						break;
					}
					Customer cust=stk.pop();
					if(cust!=null)
						System.out.println("Customer details are as follows: "+ cust); 
					break;

			}
		}
		
	sc.close();	



	}

}
