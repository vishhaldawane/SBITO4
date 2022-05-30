public class FunctionTypes {//public class must be defined in its own filename
	public static void main(String[] args) {
		System.out.println("Begin with main....");
		System.out.println("Lunch is over..");
		
		InterestCalculator myCalci = new InterestCalculator();
		myCalci.calculateSimpleInterest();
		myCalci.calculateSimpleInterest();
		myCalci.calculateSimpleInterest();
		
		Boxer boxer  = new Boxer();
		boxer.fight();		boxer.fight();		boxer.fight();
		boxer.defend();		boxer.defend();		boxer.fight();
		boxer.fight();		boxer.knockDown();		
	}
}
class Boxer
{
	void defend() {
		System.out.println("boxer is defending....");
	}
	void knockDown() {
		System.out.println("boxer has knockdown...");
	}
	void fight() {
		System.out.println("Boxer is fighting....");
	}
}
class FootBallPlayer
{
	void kick() { 
		System.out.println("foot ball player is kicking....");
	}
	
}
class InterestCalculator//PascalCase
{
	void calculateSimpleInterest() { //camelCase
		System.out.println("Calculating simple interest...");
	}
}
