
public class GirlTest {
	public static void main(String[] args) {
		Girl girl1 = new Girl("Jane");
		Girl girl2 = new Girl("Julie");
		Girl girl3 = new Girl("Reeta");
		
		System.out.println("girl1 "+girl1);
		System.out.println("girl2 "+girl2);
		
		//passing object as a parameter/argument into a function
		girl2.talk(10,girl1);
		
		String msg = girl3.gossip(girl1,girl2);
		System.out.println("msg "+msg);
		
	}
}

class Girl
{
	String girlName;
	
	Girl(String gn) {
		girlName = gn;
	}
	void selfTalk() {
		System.out.println(girlName+" is having self talk...");
	}
	void talk(int x) {
		System.out.println(girlName+" is talking for "+x+" minutes..");
	}
	void talk(int x, Girl g) { //g is a proxy/ref to the actual object which is being passed
		System.out.println(girlName+" is talking for "+x+" minutes with "+g.girlName);
	}
	String gossip(Girl x, Girl y) {
		System.out.println(girlName+" is gossiping with "+x.girlName+" and "+y.girlName);
		return "How is java training going on???";
	}
}

