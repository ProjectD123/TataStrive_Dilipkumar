package day6;

import java.util.Scanner;

public class UserInterface
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		

		
		System.out.println("User Interface\n---------------------");
		
		System.out.println("Student id:\n");
		int studentId=sc.nextInt();
		
		System.out.println("2.student name:\n");
		String studentName=sc.next();
		
		System.out.println("3.Department:\n");
		String department=sc.next();
		
		System.out.println("4.Gender:\n");
		String gender=sc.next();
		
		
		
		System.out.println("5.Category:\n");
		String category=sc.next();
		
		if(category.equals("H"))
		{
			System.out.println("Enter block:A B C\n");
			String blockName=sc.next();
				
			System.out.println("Enter Room type:Ac  non-AC\n");
			String roomType=sc.next();
			Hosteller hosteller=new Hosteller(studentId, studentName, department, gender, category, studentId, blockName, roomType);
			System.out.println("Total college fees is:\n"+hosteller.calculateTotalFees());
		}
		else if(category.equals("D"))
		{
			System.out.println("Enter yor location distance:\n");
			float distance=sc.nextFloat();
			DayScholar dayScholar=new DayScholar(studentId, studentName, department, gender, category,studentId, distance);
			System.out.println("Total college fees is:\n"+dayScholar.calculateTotalFees());
		}
		
		
		
		
	}
	

}

