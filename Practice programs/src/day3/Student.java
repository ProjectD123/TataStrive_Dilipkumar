package day3;

public class Student
{
	private String name;
	private int grade;
	
	public Student(String name, int grade)
	{
		this.name = name;
		this.grade = grade;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getGrade() 
	{
		return grade;
	}

	public void setGrade(int grade) 
	{
		this.grade = grade;
	}

	@Override
	public String toString()
	{
		return "Student name=" + name + ", grade=" + grade + "";
	}
	
	public static void main(String[] args)
	{
		Student list=new Student("DILIPKUMAR",1);
		System.out.println(list.toString());
	}
	
	
	
}
