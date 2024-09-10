import java.util.Scanner;
public class voteAge {
public static void main(String args[]) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR AGE:");
	int age=sc.nextInt();
	if((age>18)||(age==18))
	{
		System.out.println("Eligible for vote");
	}
	else
	{
		System.out.println("Not eligible for vote");	
	}
    }
}
