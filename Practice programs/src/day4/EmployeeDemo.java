package day4;

import java.util.Scanner;

public class EmployeeDemo
{

	public static void main(String[] args)
	
	
	{	
		Manager person1=new Manager("Dilipkumar",5555,25000,"Backend");
		Developer person2=new Developer("Dilipkumar",3355,55000,"python");
		person1.display();
	    person2.display();
	}

}
