
public class SwapTest {
	
	public static void print(int x, int y) {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	
	public static void swap(int x, int y) {
		System.out.println("swapping....");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("swapped....");
	}
	
	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		print(x,y);
		swap(x,y);
		print(x,y);
				
		
	}
}
