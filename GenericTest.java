import java.util.ArrayList;
import java.util.Iterator;

//inTention + atTention

/*
 * ARRAY
 * 	group of variables/references
 * 	of same type
 *  stored in consecutive memory
 *  referred by a common name
 *  CANNOT GROW OR SHRINK
 *  
 * COLLECTION
 * 	group of variables/references
 *  of same/diff type
 *  stored in consecutive memory
 *  referred by a common name
 *  CAN GROW OR SHRINK
 */
public class GenericTest {
	public static void main(String[] args) {
		Egg egg1 = new Egg("Hen","White",7.00f,50.0f);
		Egg egg2 = new Egg("Hen","White",7.00f,55.0f);
		Egg egg3 = new Egg("Hen","White",7.00f,52.0f);
		Egg egg4 = new Egg("Hen","White",7.00f,51.0f);
		Egg egg5 = new Egg("Hen","White",7.00f,50.0f);
		Egg egg6 = new Egg("Hen","White",7.00f,55.0f);
		
		Egg eggArray[] = new Egg[12]; //only 12 egg references are created | no 12 egg's object here
		eggArray[0]  = new Egg("Hen","White",7.00f,55.0f);
		eggArray[1]  = new Egg("Hen","White",7.00f,52.0f);
		eggArray[2]  = new Egg("Hen","White",7.00f,53.0f);
		eggArray[3]  = new Egg("Hen","White",7.00f,55.5f);
		eggArray[4]  = new Egg("Hen","White",7.00f,57.0f);
		eggArray[5]  = new Egg("Hen","White",7.00f,52.0f);
		eggArray[6]  = new Egg("Hen","White",7.00f,55.5f);
		eggArray[7]  = new Egg("Hen","White",7.00f,54.0f);
		eggArray[8]  = new Egg("Hen","White",7.00f,52.0f);
		eggArray[9]  = new Egg("Hen","White",7.00f,51.0f);
		eggArray[10] = new Egg("Hen","White",7.00f,58.0f);
		eggArray[11] = new Egg("Hen","White",7.00f,53.0f);
		
		//System.out.println("Adding 13th egg....");
		//eggArray[12] = new Egg("Hen","White",7.00f,53.0f);
		
		for (int i = 0; i < eggArray.length; i++) {
			System.out.println(eggArray[i]);
		}
		System.out.println("------------------");
		
		
		ArrayList<Egg> eggContainer = new ArrayList<Egg>();
		System.out.println("Egg Container is created....");
		
		System.out.println("Adding egg1 ");
		eggContainer.add(egg1);
		
		System.out.println("Adding egg2 ");
		eggContainer.add(egg2);
		
		System.out.println("Adding egg3 ");
		eggContainer.add(egg3);
		
		System.out.println("Adding egg4 ");
		eggContainer.add(egg4);
		
		System.out.println("Adding egg5 ");
		eggContainer.add(egg5);
		
		System.out.println("Adding egg6 ");
		eggContainer.add(egg6);
		
		System.out.println("----iterating----");
		
		Iterator<Egg> eggIter = eggContainer.iterator();
		while(eggIter.hasNext()) {
			Egg theEgg = eggIter.next();
			System.out.println("The Egg : "+theEgg);
		}
		
		
		
	}
}
class Egg
{
	String type;
	String color;
	float cost;
	float weight;
	
	public Egg(String type, String color, float cost, float weight) {
		super();
		this.type = type;
		this.color = color;
		this.cost = cost;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Egg [type=" + type + ", color=" + color + ", cost=" + cost + ", weight=" + weight + "]";
	}

	
}

