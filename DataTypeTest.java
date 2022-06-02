import java.io.PrintWriter;

public class DataTypeTest {
	public static void main(String[] args) {
		
		// -128 -127 -126  ..-4 -3 -2 -1 0 1 2 3 4 to 127
		byte nurseryKidsCount=89;
		System.out.println("Nursery kids : "+nurseryKidsCount);
		System.out.println("MIN byte  : "+Byte.MIN_VALUE);
		System.out.println("MAX byte  : "+Byte.MAX_VALUE);
		System.out.println("byte size : "+Byte.SIZE);
		System.out.println("----------------------");
		short universityStudentCount=32767;
		System.out.println("University students : "+universityStudentCount);
		System.out.println("MIN Short : "+Short.MIN_VALUE);
		System.out.println("MAX Short : "+Short.MAX_VALUE);
		System.out.println("Short size : "+Short.SIZE);
		
		System.out.println("----------------------");
		int internationalUniversityStudentCount=3132767;
		System.out.println("International University students : "+internationalUniversityStudentCount);
		System.out.println("MIN Integer : "+Integer.MIN_VALUE);
		System.out.println("MAX Integer : "+Integer.MAX_VALUE);
		System.out.println("Integer size : "+Integer.SIZE);
		System.out.println("----------------------");
		
		long policyNumber=9223372036854775807L;
		System.out.println("PolicyNumber: "+policyNumber);
		System.out.println("MIN Long    : "+Long.MIN_VALUE);
		System.out.println("MAX Long    : "+Long.MAX_VALUE);
		System.out.println("Long size   : "+Long.SIZE);
		System.out.println("----------------------");
		
		float rateOfInterest=9.5f;
		System.out.println("rateOfInterest: "+rateOfInterest);
		System.out.println("MIN Long rate : "+Float.MIN_VALUE);
		System.out.println("MAX Long rate : "+Float.MAX_VALUE);
		System.out.println("Float size    : "+Float.SIZE);
		
		System.out.println("----------------------"); //186000.519 miles/sec
		
		double rateOfInterest2=9.5f;
		System.out.println("rateOfInterest2: "+rateOfInterest2);
		System.out.println("MIN Long rate  : "+Double.MIN_VALUE);
		System.out.println("MAX Long rate  : "+Double.MAX_VALUE);
		System.out.println("Double size    : "+Double.SIZE);

		System.out.println("----------------------"); //186000.519 miles/sec
		
		boolean isCertified=true;
		System.out.println("isCertified: "+isCertified);
		
		//ASCII - 255 letters, UNICODE 
		
		char alphabet='A';
		System.out.println("alphabet       : "+alphabet);
		System.out.println("MIN Character  : "+Character.MIN_VALUE);
		System.out.println("MAX Character  : "+Character.MAX_VALUE);
		System.out.println("char size      : "+Character.SIZE);

		System.out.println("----------------------"); //186000.519 miles/sec
		//import java.io.PrintWriter; <-- put this line at the top 
		
		// Byte based stream		vs		Character based stream
		//	ASCII								UNICODE
		//	PrintStream							PrintWriter
		//Sytem.out.println
		
		char aa1='\u0905'; 
		char aa2='\u2665'; 
		char aa3='\u263A'; 
		PrintWriter myWriter = new PrintWriter(System.out,true);
		myWriter.println("aa1 ="+aa1);
		myWriter.println("aa2 ="+aa2);
		myWriter.println("aa3 ="+aa3);
		
		// https://unicode-table.com/en
		
		

		
	}
}
