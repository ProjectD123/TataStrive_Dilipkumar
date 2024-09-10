package day5;

public class Icici extends Gpay
{
	private double balance=5000;
	private int pin=1111;

	@Override
	public void makePayment(double amount)
	{
		if(amount<balance)	
		{
			balance-=amount;
			String transDetails="payment of rs."+amount+"made using icici";
			recordTransaction(transDetails);
		}
	}

	
	public void checkBalance(int pin) 
	{
		if(this.pin==pin) 
		{
		System.out.println("Ypur balance is: "+balance);
		}
		else
		{
			System.out.println("Invalid pin");
		}
		
	}

}
