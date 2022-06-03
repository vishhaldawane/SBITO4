
public class ThreadTest2 {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		Train train = new Train();
		Ship ship = new Ship();
		Flight flight = new Flight();
		
		myCar.start();
		train.start();
		ship.start();
		flight.start();
		
	}
}

class Car extends Thread //1
{
	public void run() { //2
		for (int i = 1; i <= 250; i++) {
			System.out.println("Car is running....."+i);
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
