import java.util.Scanner;
public class oddeve {

	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER:");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("EVEN NUMBER");
		}
		else
		{
			System.out.println("ODD NUMBER");	
		}
	    }
	}

