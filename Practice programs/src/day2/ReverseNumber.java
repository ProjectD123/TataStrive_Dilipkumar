package day2;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBERS");   //1234
		int number=sc.nextInt();
		
		int number2=number;
	    int remainder=0;
	    while(number>0)
	    {                             
	    	remainder=(remainder*10)+number%10;   	     
	    	number=number/10;     
	    }
	    
	    
	    if(remainder==number2)
	    {
	    	System.out.println( "Givin number is palindrom:  " +remainder);
	    }
	    else
	    {
	    	System.out.println("Reversed number is: " +remainder);
	    }
	    
	    
	}
}
  


//1234 >
//rem=0*10 + 1234%10 >   4*10 + 123%10      43*10 + 12%10   432*10 + 1%10        4   >  43  >  432 >  4321
//no=1234/10         >   123/10             12/10           1/10                 123 >  12  >  1   >  0