import java.util.Scanner;

public class LotteryWinners {
	public static void main(String args[]) {
		System.out.println("Enter Your Lotery Number");
		 Scanner sc = new Scanner(System.in);
		 int number=sc.nextInt();
		 int winner1= 111;
		 int winner2= 222;
		 int winner3= 333;
		 
		 if((number==winner1)||(number==winner2)||(number==winner3))
		 {
	     System.out.println("YOU ARE WINNER");
		 }
		 else
		 {
			 System.out.println("YOU ARE NOT WINNER");	 
		 }
		 }
}


