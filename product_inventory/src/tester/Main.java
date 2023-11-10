package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utility.Utils.*;
import core.Product;
import custom_exceptn.CustomException;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		boolean exit=false;
		while(!exit)
		{	
		System.out.println("ENter your choice-->  1.Add new product  2.Update price of product  3.Total inventory value 4.Display 5.Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1://Add new product
		productList.add(new Product("Watch", 500, 10));
		productList.add(new Product("Pens", 20, 100));
		productList.add(new Product("Bottles", 30, 80));
		//Product products=new Product(name, price, qty);
		//System.out.println("New product added to inventory");
		break;
		
		case 2://update the price of product
			System.out.println("Enter the product for which you want to update the price");
			String nameOfTheProduct=sc.next();
			Product product;
			//If we don't handle null situation then it will give NULL POINTER EXCEPTN
			try 
			{
				product = getProductByName(productList,nameOfTheProduct);
	
			} catch (CustomException e) 	
			{
				System.out.println(e.getMessage());
				break;
			}
			
			System.out.println("Enter the new price for the entered product: ");
			product.setPrice(sc.nextDouble());
			System.out.println("The new updated details are: name: "+product.getName()+" Updated price: "+product.getPrice());
			break;
			
		case 3:
			break;
			
		case 4://displaying
			for(Product i:productList)
			{
				System.out.println(i);
			}
			break;
		
		case 5:
			exit=true;
		}
	  }
	}

}
