
public class ThreadTest2 {
	public static void main(String[] args) {

		Chalk ch1 = new Chalk("White");
		Chalk ch2 = new Chalk("\tGreen");
		Chalk ch3 = new Chalk("\t\tPink");
		
		Thread t1 = new Thread(ch1);
		Thread t2 = new Thread(ch2);
		Thread t3 = new Thread(ch3);
		
		t1.start();
		t2.start();
		t3.start();
		
		/*
		Car myCar1 = new Car("Honda");
		Car myCar2 = new Car("Kia Carnival");
		Car myCar3 = new Car("BMW");
		
		Train train1 = new Train();
		Train train2 = new Train();
		
		Ship ship1 = new Ship();
		Ship ship2 = new Ship();
		
		Flight flight1 = new Flight();
		Flight flight2 = new Flight();
		
		myCar1.start();
		myCar2.start();
		myCar3.start();
		
		
		train1.start();
		train2.start();
		
		ship1.start();
		ship2.start();
		
		flight1.start();
		flight2.start();
		*/
	}
}
/* I by extending java.lang.Thread class
 * 
 * 1. Extends java.lang.Thread
 * 			class Car extends Thread
 *  
 * 2. override the run method
 * 		public void run()  { }
 * 
 * 3. Create teh object of your extended class, ie Car
 * 			Car car = new Car();
 * 
 * 4. invoke the start() method of car,which'l invoke run()
 * 				car.start(); --> run();
 * 
 * II. by implementing java.lang.Runnable interface
 * 
 * 1. Write a class to implement Runnable interface
 *		class Chalk extends Stone implements Runnable
 *
 * 2. mandate to define the run method
 *  		public void run()  { }
 *  
 * 3. Create the object of your extended class, ie Chalk
 * 		Chalk ch = new Chalk();
 * 
 * 4. Create the object of java.lang.Thread class
 * 		Thread t1 = new Thread(ch);
 * 
 * 
 * 5. Invoke the start over t1, which'l invoke ch's run()
 *  t1.start(); --> run() method of ch
 * 
 */
class Car extends Thread //1
{
	String model;
	
	
	Car(String m) {
		model = m;
	}
	
	public void run() { //2 - your logic to participate in threading goes here
		for (int i = 1; i <= 250; i++) {
			System.out.println(model+" car is running....."+i);
		}
	}
}
class Train extends Thread //1
{
	public void run() { //2
		for (int i = 1; i <= 550; i++) {
			System.out.println("\tTrain is running....."+i);
		}
	}
}

class Ship extends Thread //1
{
	public void run() { //2
		for (int i = 1; i <= 750; i++) {
			System.out.println("\t\tShip is sailing....."+i);
		}
	}
}


class Flight extends Thread //1
{
	public void run() { //2
		for (int i = 1; i <= 1000; i++) {
			System.out.println("\t\t\tFlight is flying....."+i);
		}
	}
}

class Stone {
	
}
class Chalk extends Stone implements Runnable
{
	String chalkColor;
	
	Chalk(String c) {
		chalkColor=c;
	}
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(chalkColor+" Chalk is writing....."+i);
		}
	}
}

