import java.util.Scanner;

public class PositiveNegativeZoro {
	public static void main(String args[]) {
		System.out.println("Enter Number");
		 Scanner sc = new Scanner(System.in);
		 int number=sc.nextInt();
		 
		 
		 if(number==0)
		 {
	     System.out.println("Given Number Is Zero");
		 }
		 else if(number>0)
		 {
			 System.out.println("POSITIVE NUMBER");	 
		 }
		 else {
			 System.out.println("NEGATIVE NUMBER");	
		 }
		 }


	}

