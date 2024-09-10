package day3;

import java.util.Scanner;

public class PersonRunner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=scanner.nextLine();
		
		System.out.println("Enter Age: ");
		int age=scanner.nextInt();
		
		Person p1=new Person(name,age);
		System.out.println(p1.toString());
		
	}

}
