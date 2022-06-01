
public class PointTest {
	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(10,20);
		System.out.println("p1 "+p1);
		
		System.out.println("-------------------");
		
		Point3D p2 = new Point3D(50,60,70);
		System.out.println("p2 "+p2);
		
		
	}
}

class Point2D
{
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x=" + x + ", y=" + y + "";
	}
}

class Point3D extends Point2D //isA
{
	private int z; //extra
	
	public Point3D(int x, int y,int z) { //extra
		super(x,y); //reuse the code
		this.z = z; //extra
	}
	public String toString() { //reuse the code
		return ""+ super.toString()+ ", z=" + z + "";
	}
}


/*
 * GrandFather gf = new GrandFather();
		System.out.println("---------------");
		
		Father f = new Father();
		System.out.println("---------------");
		
		Child c = new Child(30);
		System.out.println("---------------");
 * 
 * 
 */
class GrandFather //extends Object
{
	GrandFather(int x) {
		//super();
		System.out.println("GrandFather ctor...");
	}
}
class Father extends GrandFather
{
	Father(int y) {
		super(78);
		System.out.println("\tFather ctor...");
	}
}
class Child extends Father
{
	Child(int i) {
		super(66);
		System.out.println("\t\tChild ctor...");
	}
}













