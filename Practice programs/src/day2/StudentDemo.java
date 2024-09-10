package day2;

import java.util.Scanner;

public class StudentDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		Student list1=new Student(name);
	
		   
	    System.out.println(list1);
	 
	}

}
