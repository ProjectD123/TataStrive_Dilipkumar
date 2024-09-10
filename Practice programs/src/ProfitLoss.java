import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the cost price: ");
	    int cost=sc.nextInt();
	    System.out.println("Enter the selling price: ");
	    int selling=sc.nextInt();
	    int profit,loss;

	    if(selling>cost)
	    {
	    	profit=cost-selling;
	        System.out.println( "Profit is: "+cost ); 

	    }
	    else if(cost>selling)
	    {
	    	loss=cost-selling;
	        System.out.println( "Loss is: "+loss );
	    }
	    else 
	    {
	    	System.out.printf("no profit and no loss");

	    }
	}
	}

