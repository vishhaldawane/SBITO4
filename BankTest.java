import bankexception.OpeningBalanceException;

public class BankTest {
	public static void main(String[] args) {
		BankAccount baObj1;
		try {
			
			baObj1 = new BankAccount(101,"Jack",2000);
			System.out.println("baObj1 "+baObj1);
			
		} catch (OpeningBalanceException e) {
		
			System.out.println("Some Problem during account creation : "+e);
		}
		
	}
}
class BankAccount {
	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolder, double accountBalance) throws OpeningBalanceException 
	{
		super();
		System.out.println("BankAccount ctor called...");
		System.out.println("setting accountNumber");
		this.accountNumber = accountNumber;
		
		System.out.println("setting accountHolder");
		this.accountHolder = accountHolder;
		

		if(accountBalance < 3000) {
			throw new OpeningBalanceException("In order to open an account, the opening balance should be >=3000");
		}
		else {
			System.out.println("setting accountBalance");
			this.accountBalance = accountBalance;
		}
		
		System.out.println("BankAccount ctor is OVER...");
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
	
}
