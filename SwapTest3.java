
public class SwapTest3 {

	public static void main(String[] args) {

		AnyPair<Integer> ip = new AnyPair<Integer>(10, 20);
		ip.print();
		ip.swap();
		ip.print();
		System.out.println("-------------------");
		AnyPair<Float> fp = new AnyPair<Float>(10.5f, 20.5f);
		fp.print();
		fp.swap();
		fp.print();
		System.out.println("-------------------");
		Song s1 = new Song("I want it that way","Millenium","Backstreet Boys",2004);
		Song s2 = new Song("My Heart Will Go On","Titanic","Celine Dior",1995);

		AnyPair<Song> sp = new AnyPair<Song>(s1, s1);
		sp.print();
		sp.swap();
		sp.print();
		
		
	}
}
//generic class - template class  
class AnyPair<T> {
	T x;	T y;
	AnyPair(T x, T y) {
		System.out.println("AnyPair(T,T)");
		this.x = x;		this.y = y;
	}
	public void print() {
		System.out.println("x " + x);
		System.out.println("y " + y);
	}
	public void swap() {
		System.out.println("swapping....");
		T temp = x;		x = y;		y = temp;
		System.out.println("swapped....");
	}
}

