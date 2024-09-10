import java.util.Scanner;

public class FindMaxThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Two Number: ");
	    int number1=sc.nextInt();
	    int number2=sc.nextInt();
	    int number3=sc.nextInt();
       
	    if((number1>number2)&& (number1>number3))
	    {
	        System.out.println( "maximum number is: "+number1 ); 

	    }
	    else if((number2>number1)&&(number2>number3))
	    {
	        System.out.println( "maximum number is: "+number2 );
	    }
	    else if((number3>number1)&&(number3>number2))
	    {
	        System.out.println( "maximum number is: "+number3 );
	    }
	    else 
	    {
	    	System.out.printf( "All are Equel: "+number2 +" "  +number2  +" " +number3);

	    }
        
	    
	}

}
