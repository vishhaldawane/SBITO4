
public class KiteTest {
	public static void main(String[] args) {
		Kite.printKiteCount();
		
		Kite k1 = new Kite("Green",50,"Vineet");
		Kite k2 = new Kite("White",60,"Nandish");
		Kite k3 = new Kite("Black",70,"Karan");
		
		Kite.printKiteCount();
	}
}

class Kite
{
	//below member is not belong to the object
	private static int    kiteCount; //default is 0
	
	//below members are belong to the object 
	private        String color;
	private        int    length;
	private        String owner;
	
	public Kite(String color, int length, String owner) {
		super();
		System.out.println("Kite is created....");
		this.color = color;
		this.length = length;
		this.owner = owner;
		++kiteCount;
	}

	public static void printKiteCount() {
		System.out.println("Kites in the sky : "+kiteCount);
	}
	
}


