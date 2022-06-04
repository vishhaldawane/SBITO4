public class BankAccount {
	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolder, double accountBalance)  
	{
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;	
		this.accountBalance = accountBalance;
	}
	
	void withdraw(double amountToWithdraw) {
		
			System.out.println("Withdrawing..."+amountToWithdraw);
			this.accountBalance = accountBalance - amountToWithdraw;
		
	}
	
	void depsoit(double amountToDeposit) {
			System.out.println("Depositing..."+amountToDeposit);
			this.accountBalance = accountBalance + amountToDeposit;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
	
}