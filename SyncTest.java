
public class SyncTest {
	public static void main(String[] args) {
		BankAccount baAccObj = new BankAccount(101, "Suresh",50000);
		System.out.println(" "+baAccObj);
		
		
		Teller teller1 =  new Teller("Reeta",5000,baAccObj);
		Teller teller2 =  new Teller("\tJane",7000,baAccObj);
		Teller teller3 =  new Teller("\t\tJulie",8000,baAccObj);
		
		teller1.start();
		teller2.start();
		teller3.start();
		
		try {
			teller1.join();
			teller2.join();
			teller3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" "+baAccObj);
		
	}
}
class Teller extends Thread //1
{
	String tellerName;
	double cashToDeposit;
	BankAccount bankAccRef;
	
	Teller(String tn, double cash, BankAccount whichAcc) {
		tellerName=tn;
		cashToDeposit=cash;
		bankAccRef = whichAcc;
	}
	public void run() {
		System.out.println(tellerName+" depositing cash..."+cashToDeposit);
		bankAccRef.deposit(tellerName,cashToDeposit);
	}
}
