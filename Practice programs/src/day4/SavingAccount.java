package day4;

class SavingAccount extends BankAccount
{
	double intrestRate;

	public SavingAccount(double accountNumber, double balance,double intrestRate )
	{
		super(accountNumber, balance);
		this.intrestRate=intrestRate;
	}
	
	public void addInterest()
	{
		double interest=balance*intrestRate/100;
		balance +=interest;
		System.out.println("Interest Rate:" +interest);
		
	}
	
	
	
	
}
