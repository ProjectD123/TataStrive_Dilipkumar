package day3;

public class Rectangle 
   {
	private double length;
	private final static double width;
	double area;
	
	static
	{
		width=1.0;
	}
	
	
	public Rectangle(double length)
	{
		this.length = length;
	}
	
	
	double area() 
	{
		double rect=length*width;
		return rect;	
	}
	
	
	@Override
	public String toString()
	{
		return "length=" + length + " width=" + width + " area=" +area();
	}

	public static void main(String[] args) 
	{
		Rectangle box1=new Rectangle(0);
     	System.out.println(box1);				
	}
	

}
