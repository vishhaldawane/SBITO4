import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankTest {
	public static void main(String[] args) {
		
		System.out.println("begin main");
		
			BankAccount x ;
		
			BankAccount bankAccObj1 = new SavingsAccount();
			BankAccount bankAccObj2 = new CurrentAccount();
			BankAccount bankAccObj3 = new CreditAccount();	
			
			bankAccObj1.setBankAccount(101, "Jack", 5000,2022,12,25);
			bankAccObj2.setBankAccount(102, "Jane", 6000,2015,10,20);
			bankAccObj3.setBankAccount(103, "Smith",7000,2010,8,12);
			
			
			bankAccObj1.printAccount();
			bankAccObj2.printAccount();
			bankAccObj3.printAccount();
			
			bankAccObj1.withdraw(2000);
			bankAccObj1.printAccount();
			
			bankAccObj1.deposit(9000);
			bankAccObj1.printAccount();
			
			bankAccObj1.withdraw(30000);
			bankAccObj1.printAccount();
			
			
		System.out.println("end main");
	
		
	}
	
	
}

abstract class BankAccount //extends ...
{
	private int accountNumber; //DECLARED HERE
	private String accountHolderName;
	private double accountBalance;
	private LocalDate accountOpeningDate; //it is null

	public void setBankAccount(int x, String y, double z, int year, int month, int day) {
		printLog();
		accountNumber = x; //INITIALIZED HERE
		accountHolderName = y;
		accountBalance = z;
		accountOpeningDate = LocalDate.of(year, month, day);
	}
	
	public void printAccount() 	{
		printLog();
		System.out.println("Account Number  : "+accountNumber);//PRINTED HERE
		System.out.println("Account Holder  : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Account OpnDate : "+accountOpeningDate);
		System.out.println("--------------------------");	
	}
	
	private void printLog() {
		System.out.println(">>> Account activity ininitated at "+LocalDateTime.now()+" <<<");
	}
	void withdraw(double amountToWithdraw) {
		printLog();
		if(amountToWithdraw > accountBalance) {
			throw new RuntimeException("Insufficient funds.....");
		}
		System.out.println(accountHolderName +" is withdrawing amount..."+amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
	}
	
	void deposit(double amountToDeposit) {
		printLog();
		if(amountToDeposit > 50000) {
			throw new RuntimeException("Please provide income proof details/PAN");
		}
		
		System.out.println(accountHolderName +" is deposting amount..."+amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
	}
}
class SavingsAccount extends BankAccount
{
	
}
class CurrentAccount extends BankAccount
{
	
	
}
class CreditAccount extends BankAccount
{
	
}
	


