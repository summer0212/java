package core;

public class Product 
{
	private String name;
	private double price;
	private int qty ;
	
	public Product(String name,double price,int qty)
	{
		this.name=name;
		this.price=price;
		this.qty=qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + ", qty=" + qty;
	}
	
	
}
