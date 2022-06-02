public class PhoneTest {
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.dial();
		byte police=100;
		ph.dial(police);
		
		short railwayEnquiryNumber=139;
		ph.dial(railwayEnquiryNumber);
		
		byte stdCode=22;
		short number=32323;
		ph.dial(stdCode,number);
		
		byte countryCode=91;
		long phoneNumber=123123123;
		ph.dial(countryCode, phoneNumber);
		ph.dial(phoneNumber,countryCode);
		
//overloading
		//a function can be redefined under following
		//guidelines
	//1. type of arguments
	//2. number of arguments
    //3. sequence of types of arguments
		
	}
}
class Phone
{
	void dial() {
		System.out.println("dial() nowhere....");
	}
	void dial(byte helpLine) {
		System.out.println("dial(byte) to ...."+helpLine);
	}
	void dial(short helpLine) {
		System.out.println("dial(short) to ...."+helpLine);
	}
	void dial(byte code, short number) {
		System.out.println("dial(short,short) to ...."+code+","+number);
	}
	void dial(byte code, long number) {
		System.out.println("dial(short,long) to ...."+code+","+number);
	}
	void dial(long number, byte code) {
		System.out.println("dial(long,short) to ...."+code+","+number);
	}
}
