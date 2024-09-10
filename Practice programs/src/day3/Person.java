package day3;

public class Person
{
	private String name;
	private int age;
	

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;	
		
	}
	
	public boolean isAdult()
	{
		return age>=18?true:false;
		
	}
	

	@Override
	public String toString() 
	{
		return "name=" + name  + " age=" + isAdult() ;
	}
	    
	
}
		
	