import java.util.Scanner;
public class TotalAverage {
		public static void main(String args[]) {
			
		
			System.out.println("ENTER YOUR MARK");
			
			 Scanner sc1 = new Scanner(System.in);
			 int tamil=sc1.nextInt();
			 
			 System.out.println("ENTER YOUR MARK");
			 Scanner sc2 = new Scanner(System.in);
			 int english=sc2.nextInt(); 
			 
			 System.out.println("ENTER YOUR MARK");
			 Scanner sc3 = new Scanner(System.in);
			 int maths=sc3.nextInt(); 
			 
			 System.out.println("ENTER YOUR MARK");
			 Scanner sc4 = new Scanner(System.in);
			 int science=sc4.nextInt(); 
			 
			 System.out.println("ENTER YOUR MARK");
			 Scanner sc5 = new Scanner(System.in);
			 int social=sc5.nextInt(); 
			 
	int total=tamil+english+maths+science+social;
	System.out.println("YOUR TOATL MARK IS: "+total);
	
	double average=total/5;
	System.out.println("YOUR AVERAGE IS: "+average);		 
}
}