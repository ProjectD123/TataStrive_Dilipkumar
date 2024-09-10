package day5;
import java.util.ArrayList;

abstract public class Gpay
{
	private static ArrayList<String> transaction=new ArrayList<String>();
	public abstract void makePayment(double amount);
	public abstract void checkBalance(int pin);
	public void commonfeature()
	{
		System.out.println("Procecesing payment using Gpay");
	}
	
	public void recordTransaction(String transDetails)
	{
		transaction.add(transDetails);
	}
	
	public void showHistory()
	{
		transaction.forEach(s->System.out.println(s));
	}
	
	
	
}
