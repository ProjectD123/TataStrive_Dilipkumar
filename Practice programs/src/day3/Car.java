package day3;

public class Car
{
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	
	
	public String displayDetails()
	{
		String cars=("Make: " +make + " model: " +model + " year: " +year);
		return cars;
	}
	
	
	public String toString()
	{
		return "make: " + make +  ", model: " + model + ", year: " + year ;
	}
   
	public static void main(String[] args)
	{
		Car list1=new Car("AUDI","sds",1918);
		Car list2=new Car("BMW", "sds", 2018);
		Car list3=null;
		System.out.println(list1);	
		System.out.println(list2.displayDetails());	
		System.out.println(list3);	
			
	}
	
	
	
}
