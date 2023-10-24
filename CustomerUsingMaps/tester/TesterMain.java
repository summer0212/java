package tester;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import core1.*;
import custom_exceptn.CustomerHandlingExcptn;

import static utils.ValidatePlans.*;

public class TesterMain
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            //key=(email)-->String  value=Customer
            Map<String,Customer> customers = new HashMap<String,Customer>();
            boolean exit=false;
            while(!exit)
            {
                System.out.println("All the choices");
                System.out.println("Enter your choice");
                        //int id=sc.nextInt();
                        String fn=sc.next();
                        String ln=sc.next();
                        String email=sc.next();
                        String paswd=sc.next();
                        double regAmt=sc.nextDouble();
                        String dob=sc.next();
                        String plan=sc.next();
                try
                {
                    switch(sc.nextInt())
                    {
                        case 1:
                        System.out.println("Customer registration");
                        //<datatype> <reference/variable>
                        Customer cList = validateAllInputs(fn,ln,email,paswd,regAmt,dob, plan,customers);//whys are we sending customers??
                        customers.put(cList.getEmail(),cList);
                        System.out.println("Customers signed in");
                        break;

                        case 2:
                        System.out.println("Sign in");
                        cList = authenticateCustomer(email,paswd,customers);
                        System.out.println("Login successful"+cList);
                        break;

                        case 3:
                        System.out.println("Change the old password");
                        cList=authenticateCustomer(email, paswd, customers);
                        cList.setPassword(sc.next());
                        System.out.println("New password updated");
                        break;

                        case 4://remove
                        System.out.println("To Unsubscribe a customer");
                        System.out.println("Enter the email id");
                        cList=customers.remove(sc.next());
                        if(cList==null)
                        throw new CustomerHandlingExcptn("The email id does not exist");
                        System.out.println("Customer unsubscribed");
                        break;

                        case 5:
                        System.out.println("DIsplay all details");
                        for(Customer c: customers.values())
                        System.out.println(c);
                        break;
                        
                        case 6://sorting using email id
                        	TreeMap<String,Customer> treeClist=new TreeMap<String,Customer>(customers);
                        	System.out.println("All details printed in sorted order a/c email");
                        	for(Customer c : treeClist.values())
                        		System.out.println(c);
                            break;
                        
                        case 7://sorting as per dob-->comparator-->compare()
                        	ArrayList<Customer> list=new ArrayList<Customer>(customers.values());
                        	Comparator<Customer> compare=(c1,c2)-> c1.getDob().compareTo(c2.getDob());
                        	Collections.sort(list,compare);
                        	System.out.println("customer sorted as per dob");
                        	list.forEach(c -> System.out.println(c));
                        	break;
                        	

                        case 0:
                        exit=true;
                        break;




                    }

                }catch(Exception e)
                {
                    e.printStackTrace();
					sc.nextLine();
                }
                

                
            }

        }
        
    }

    
}
