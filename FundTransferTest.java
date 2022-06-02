
public class FundTransferTest {
	public static void main(String[] args) {

		CurrentAccount ca = new CurrentAccount(101, "SBI", 500000);
		SavingsAccount sa = new SavingsAccount(102, "Jack", 15000);
		
		
		
		System.out.println("ca "+ca.balance);
		System.out.println("sa "+sa.balance);
		
		FundsTransferService fundTranService = new FundsTransferService();
		fundTranService.fundTransfer(ca, sa, 75000);
		
		System.out.println("------------------------");
		System.out.println("ca "+ca.balance);
		System.out.println("sa "+sa.balance);
	}
}
class BankAccount
{
	int accountNumber;
	String accountHolder;
	double balance;
	
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + "]";
	}
	
	
}

class FundsTransferService
{
					//SOURCE				TARGET
	void fundTransfer(Withdrawing ca, Depositing sa, double amtToTransfer) 
	{
		if(ca.getBalance()>amtToTransfer) {
			
			//sa.withdraw(amtToTransfer); //invalid
			
			ca.withdraw(amtToTransfer); //valid
			sa.deposit(amtToTransfer); //valid
			
			//ca.deposit(amtToTransfer); //invlaid
			
		}
		else {
			throw new RuntimeException("Insufficient funds...");
		}
	}
}

interface Withdrawing {
	void withdraw(double amt);
	double getBalance();
}
interface Depositing {
	void deposit(double amt);
	double getBalance();
}

class CurrentAccount extends BankAccount implements Withdrawing, Depositing
{
	
	public CurrentAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amt) {
		System.out.println("CurrentAccount : withdrawing...."+amt);
		balance = balance - amt;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amt) {
		System.out.println("CurrentAccount : depositing...."+amt);
		balance = balance + amt;
	}
}
class SavingsAccount extends BankAccount implements Withdrawing, Depositing
{
	
	public SavingsAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amt) {
		System.out.println("CurrentAccount : withdrawing...."+amt);
		balance = balance - amt;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amt) {
		System.out.println("CurrentAccount : depositing...."+amt);
		balance = balance + amt;
	}	
}
