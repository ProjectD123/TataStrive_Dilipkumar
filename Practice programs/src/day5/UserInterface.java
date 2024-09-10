package day5;

import java.util.Scanner;

public class UserInterface
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Icici icici=new Icici();
		Sbi sbi=new Sbi();
		Gpay gpay=icici;
		int ch=0;
		int ch2=0;
		do 
		{
		System.out.println("User Interface\n---------------------");
		System.out.println("1.Make payment");
		System.out.println("2.Check balance");
		System.out.println("3.Show History");
		System.out.println("4.Switch account");
		System.out.println("5.Exit");
		ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the amount:");
					double amount=sc.nextDouble();
					gpay.makePayment(amount);
					break;
				case 2:
					System.out.println("Enter the pin:");
					int pin=sc.nextInt();
					gpay.checkBalance(pin);
					break;
				case 3:
					System.out.println("Transaction Details:\n---------------------");
					gpay.showHistory();
					break;
				case 4:
					System.out.println("Select the account \n 1.icici \n 2.sbi");
					ch2=sc.nextInt();
					if(ch2==1)
						{
							gpay=icici;
							System.out.println("Account is switched to ICICI account\n---------------");
							
						}
					else if(ch2==2)
						{
							gpay=sbi;
							System.out.println("Account is switched to SBI account\n---------------");
							
						}
				case 5:
					System.out.println("Thank you for using GPAY ");
					break;
					
				default:
					System.out.println("Invalid value");
					
			}
		}while(ch!=5);
	}

}
