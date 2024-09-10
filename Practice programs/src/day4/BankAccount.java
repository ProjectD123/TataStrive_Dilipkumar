package day4;

class BankAccount
{
	double accountNumber;
	double balance=1;
	
	public BankAccount(double accountNumber, double balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{   
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited: " +amount);
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount>0 && amount <= balance)
		{
			balance-=amount;
			System.out.println("Withdraw" +amount);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
	
	
}
