import java.util.Scanner;

public class FilterPrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int[] arr;
		int arr1=sc.nextInt();

             for(int i=0;i<=arr1;i++)
             {
              if(isprime(i))
            	 {
            		 System.out.println(i); 
            	 }
             }
	}
	
	
	public static boolean isprime(int a) {
		if(a<=1)
		return false;
		
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		  return true;
	}
	
}