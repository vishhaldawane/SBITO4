
public class ThreadTest {
	public static void main(String[] args) {
		Samosa s = new Samosa();
		s.eat();
	}
}
interface Eatable
{
	void eat();
}
class FoodItem implements Eatable
{
	void prepare() {
		System.out.println("preparing...");
		eat();
	}
	public void eat() {
		System.out.println("eating....");
	}
}

class Samosa extends FoodItem
{
	public void eat() {
		System.out.println("eating...the samosa....");
	}
}
