package day4;

class Manager extends Employee
{
	String department;
	public Manager(String name, int id, int salary,String department) 
	{
		super(name, id, salary);
		this.department=department;
	}
	
	
	public void display()
	{
	    super.display();
		System.out.println("Department" +department);
	}
}
