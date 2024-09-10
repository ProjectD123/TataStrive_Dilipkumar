package day4;

public class Developer extends Employee
{
    String programing;
	public Developer(String name, int id, int salary,String programing) 
	{
		super(name, id, salary);
		this.programing=programing;	
	}
	
	public void display()
	{
		super.display();
		System.out.println("Department:" +programing);
	}
	

}
