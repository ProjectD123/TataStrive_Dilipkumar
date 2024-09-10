import java.util.*;
public class FindMaxNumber {
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Two Number: ");
	    int number1=sc.nextInt();
	    int number2=sc.nextInt();

	    if(number1>number2)
	    {
	        System.out.println( "maximum number is: "+number1 ); 

	    }
	    else if(number2>number1)
	    {
	        System.out.println( "maximum number is: "+number2 );
	    }
	    else 
	    {
	    	System.out.printf( "Both are Equel: "+number2 +"and"  +number2 );

	    }
	}
}



