package day4;

public class Shaps
{
	private String shapsName;
	private double area;
	private String color;
	private double length;
	private double breadth;
	
	
	public Shaps()
	{
		super();
	}
	
	public Shaps(String shapsName, double area, String color) 
	{
		super();
		this.shapsName = shapsName;
		this.area = area;
		this.color = color;
	}
	
	public double areaOfRect(double area)
	{
		double a=length*breadth;
		return a;
	}
	
	
}
