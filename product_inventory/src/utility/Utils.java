package utility;

import java.util.List;

import core.Product;
import custom_exceptn.CustomException;

public class Utils 
{
	public static Product getProductByName(List<Product> p,String itemName)throws CustomException
	{
		for(Product i:p)
		{
			String s=i.getName();
			if(s.equals(itemName))
			{

				return i;
			}
		}
		throw new CustomException("Product not found");
	}

}
