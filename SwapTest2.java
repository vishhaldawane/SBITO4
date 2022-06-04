
public class SwapTest2 {

	public static void main(String[] args) {

		IntegerPair ip = new IntegerPair(10, 20);
		ip.print();
		ip.swap();
		ip.print();
		System.out.println("-------------------");
		FloatPair fp = new FloatPair(10.5f, 20.5f);
		fp.print();
		fp.swap();
		fp.print();
		System.out.println("-------------------");
		Song s1 = new Song("I want it that way","Millenium","Backstreet Boys",2004);
		Song s2 = new Song("My Heart Will Go On","Titanic","Celine Dior",1995);

		SongPair sp = new SongPair(s1, s2);
		sp.print();
		sp.swap();
		sp.print();
		
		
	}
}

class IntegerPair {
	int x;
	int y;

	IntegerPair(int x, int y) {
		System.out.println("IntegerPair(int,int)");
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println("x " + x);
		System.out.println("y " + y);
	}

	public void swap() {
		System.out.println("swapping....");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swapped....");
	}
}

class FloatPair {
	float x;
	float y;

	FloatPair(float x, float y) {
		System.out.println("FloatPair(float,float)");
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println("x " + x);
		System.out.println("y " + y);
	}

	public void swap() {
		System.out.println("swapping....");
		float temp = x;
		x = y;
		y = temp;
		System.out.println("swapped....");
	}
}

class SongPair {
	Song x;
	Song y;

	SongPair(Song x, Song y) {
		System.out.println("SongPair(Song,Song)");
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println("x " + x);
		System.out.println("y " + y);
	}

	public void swap() {
		System.out.println("swapping....");
		Song temp = x;
		x = y;
		y = temp;
		System.out.println("swapped....");
	}
}
