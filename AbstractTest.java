
public class AbstractTest {
	public static void main(String[] args) {
		
		GeometricalShape gs  = new Circle(45.6);
		
		gs.draw();
		gs.calculateArea();
		gs.calculatePerimeter();
		
		System.out.println("------------------------");
		gs = new Square(5);
		
		gs.draw();
		gs.calculateArea();
		gs.calculatePerimeter();
		
		System.out.println("------------------------");
		
		gs = new Rectangle(55, 66);
		gs.draw();
		gs.calculateArea();
		gs.calculatePerimeter();
		
	
	}
}

abstract class GeometricalShape
{
	final static double PI=3.14;
	abstract void draw(); //undefined
	abstract void calculateArea();
	abstract void calculatePerimeter();
	
	
}

class Circle extends GeometricalShape //Circle is concrete
{
	double radius;

	Circle(double r) {
		radius = r;
	}
	
	void draw() { 
		System.out.println("Circle is drawn....");
	}
	void calculatePerimeter() { 
		System.out.println("Calculated the perimeter of the Circle....");
		double periphery = 2 * PI * radius;
		System.out.println("Perimeter : "+periphery);
	}
	void calculateArea() { 
		System.out.println("Calculated the area of the Circle....");
		double area =  PI * radius * radius;
		System.out.println("Area      : "+area);
	}
}

class Square extends GeometricalShape
{
	double side;
	
	Square(double s) {
		side= s;
	}
	void draw() {
		System.out.println("Drawing a Sqaure....");
	}
	void calculateArea() {
		System.out.println("Calculating the area of the Sqaure....");
		double area = side * side;
		System.out.println("Area of the square : "+area);
	}
	void calculatePerimeter() {
		System.out.println("Calculating the perimeter of the Sqaure....");
		double periphery = 4 * side;
		System.out.println("Perimeter of the square : "+periphery);
	}
}

class Rectangle extends Square 
{
	double side2;
	
	Rectangle(double s1, double s2) {
		super(s1);
		side2= s2;
	}
	void draw() {
		System.out.println("Drawing a Rectangle....");
	}
	void calculateArea() {
		System.out.println("Calculating the area of the Rectangle....");
		double area = side * side2;
		System.out.println("Area of the Rectangle : "+area);
	}
	void calculatePerimeter() {
		System.out.println("Calculating the perimeter of the Rectangle....");
		double periphery = 2*(side + side2);
		System.out.println("Perimeter of the Rectangle : "+periphery);
	}
	
}
