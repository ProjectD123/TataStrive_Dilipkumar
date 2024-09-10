package day4;

class Employee 
{
	private String name;
	private int id;
	private int Salary;
	
	public Employee(String name, int id, int salary)
	{
		this.name = name;
		this.id = id;
		this.Salary = salary;
	}

	public void display() 
	{
		System.out.println("name="  + name + 
			   "id=" + id + 
			   "Salary=" + Salary);
	}
	
}
