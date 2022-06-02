
public class CircleTest {
	public static void main(String[] args) {
		Circle1 circ = new Circle1(12.54);
		circ.calculateArea();
		circ.calculatePerimeter();
	}
}
class Circle1 {
	final double PI=3.14;
	double radius;
	
	Circle1(double radius ) {
		this.radius = radius;
	}
	void calculateArea() {
		double area = PI * radius * radius;
		System.out.println("Area : "+area);
	}
	void calculatePerimeter() {
		double periphery = 2 * PI * radius ;
		System.out.println("Perimeter : "+periphery );
	}
}
