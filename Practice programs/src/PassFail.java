import java.util.Scanner;

public class PassFail {
	public static void main(String args[]) {
		System.out.println("ENTER YOUR MARK");
		 Scanner sc = new Scanner(System.in);
		 int number=sc.nextInt();
		 
		 
		 if(number>=40)
		 {
	     System.out.println("YOU ARE PASS");
		 }
		 else
		 {
			 System.out.println("YOU ARE FAIL");	 
		 }
		 }
}
