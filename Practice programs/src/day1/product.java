package day1;

public class product {
	
	String name;
 double price;
 int quantity;



public void setName(String name)
{
	this.name=name;
}

public void setPrice(double price)
{
     this.price=price;
}

public void setQuantity(int quantity)
{
	this.quantity=quantity;
}

public String getName()
{
	return name;
}
public double getPrice()
{
	return price;
}
public int getQuantity()
{
	return quantity;
}
public void productdetails() {
System.out.println("product name: "+name);
System.out.println("product price: "+price);
System.out.println("product quantity :"+quantity);
}

}
