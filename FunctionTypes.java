public class FunctionTypes {//public class must be defined in its own filename
	public static void main(String[] args) {
		System.out.println("Begin with main....");
	
		Dancer theDancer = new Dancer();
		theDancer.dance();
		theDancer.dancing(15);
		String msg = theDancer.dancingIsDone(40);
		System.out.println("Ratings : "+msg);
		
		int hours= theDancer.relax();
		System.out.println("Relaxing hours : "+hours);
		System.out.println("----------------");
		MyMath m = new MyMath();
		float a1 = m.calcAverage(45, 23,67);
		System.out.println("average is "+a1);
		
		 m.calculateAverage(66, 77, 88);
		
		
	}
}
class MyMath
{
	void calcAvg() {//1
		int i=10;int j=20; int k=30;
		float avg= (i+j+k)/3.0f;
		System.out.println("Avg is : "+avg);
	}
	
	float calcAverage() { //4
		int i=10;int j=20; int k=30;
		float avg= (i+j+k)/3.0f;
		return avg;
	}
	
	float calcAverage(int i,int j, int k) {//3
		float avg= (i+j+k)/3.0f;
		return avg;
	}
	
	void calculateAverage(int i,int j, int k) { //2
		float avg= (i+j+k)/3.0f;
		System.out.println("average is : "+avg);
	}
}
class Dancer
{ //time + space + situation
	
	void dance() {
		System.out.println("Dancer is dancing....");
	}
	void dancing(int mnts) {
		System.out.println("Dancer is dancing  for ...."+mnts+" minutes....");
	}
	String dancingIsDone(int mnts) {
		System.out.println("Dancer is dancing  for ...."+mnts+" minutes....");
		return "Got five star rating... * * * * * ";
	}
	int relax() {
		System.out.println("Dancer is relaxing....");
		return 6; //returning 6 as a relaxing hour of the dancer..
	}
	
}
class Font
{
	void setFont() {
		System.out.println("Setting the font....");
	}
}
class Singer {
	void sing() {
		System.out.println("Signer is singing....");
	}
}
class Writer {
	void write() {
		System.out.println("Writer is writing....");
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
