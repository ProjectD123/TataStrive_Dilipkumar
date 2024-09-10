package day4;

class CurrentAccount extends BankAccount
{
	double overDraftLimit;

	public CurrentAccount(double accountNumber, double balance,double overDraftLimit)
	{
		super(accountNumber, balance);
		this.overDraftLimit=overDraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		
		super.withdraw(amount);
	}
	
	
	
	
	
}
