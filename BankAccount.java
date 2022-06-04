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
	
	synchronized void deposit(String tn, double amountToDeposit) {
			System.out.println(tn+" Depositing..."+amountToDeposit);
			double currentBalance = getBalance(); //SELECT QUERY
			System.out.println(tn+" Finding current balance...");
			System.out.println(tn+" Balance found ..."+currentBalance);
			
			System.out.println(tn+" Calculating the amount.....");
			double newBalance = currentBalance + amountToDeposit;
			System.out.println(tn+" Amount calculated ....."+newBalance);
			
			System.out.println(tn+" Setting the new balance....");
			setBalance(newBalance); //UPDATE QUERY
			System.out.println(tn+" Balance is set....."+newBalance);
	}
	private double getBalance() { //goto the db and run SELECT
		return accountBalance;
	}
	private void setBalance(double amt) {//goto the and run UPDATE
		accountBalance=amt;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
	
}