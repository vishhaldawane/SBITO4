public class BankTest {
	public static void main(String[] args) {
		
		int accountNumber=101;
		String accountHolderName="Jack";
		double accountBalance=5000;
		
		int accountNumber2=102;
		String accountHolderName2="Jane";
		double accountBalance2=6000;
		
		int accountNumber3=103;
		String accountHolderName3="Smith";
		double accountBalance3=7000;
	
		printAccount(accountNumber, accountHolderName, accountBalance);//actual arguments 
		printAccount(accountNumber2, accountHolderName2, accountBalance2);//actual arguments
		printAccount(accountNumber3, accountHolderName3, accountBalance3);//actual arguments
		
	}
	
	public static void printAccount(int x, String y, double z)//formal arguments 
	{
		System.out.println("Account Number  : "+x);
		System.out.println("Account Holder  : "+y);
		System.out.println("Account Balance : "+z);
		
		System.out.println("--------------------------");	
	}
}




	

