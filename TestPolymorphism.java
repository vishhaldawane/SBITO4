public class TestPolymorphism {
	public static void main(String[] args) {
		Doctor x = new Doctor();
		
		x.diagnose(); //late binding - lazy loading
		
		
				x = new Surgeon();
		
		x.diagnose(); //late binding
		
		
				x = new HeartSurgeon();
		
		x.diagnose(); //late binding
		
		System.out.println("=======================");
		/*
		Doctor d = new Doctor(); 
		d.diagnose(); // EARLY BINDING | d.Doctor::diagnose() - name mangling
		
//		d.doSurgery();
//		d.doOpenHeartSurgery();
		System.out.println("---------------------");
		Surgeon s = new Surgeon();
		s.diagnose();	//  EARLY BINDING | s.Doctor.diagnose(); - inherited
		s.doSurgery();  //  s.Surgeon.doSurgery(); - exclusive
		
//		s.doOpenHeartSurgery();
		System.out.println("---------------------");
		HeartSurgeon hs = new HeartSurgeon();
		hs.diagnose();		// EARLY BINDING | hs.Doctor.diagnose(); - inherited
		hs.doSurgery();		// hs.Surgeon.doSurgery(); - inherited
		hs.doOpenHeartSurgery(); // hs.HeartSurgeon.doOpenHeartSurgery(); - exclusive
		
		
		
		
		*/
		
		
//a reference to a super class, can point to the object of its child class
	/*	Doctor x = new HeartSurgeon();
		
		if(x instanceof Doctor) {
			System.out.println("yes, x is referring to a Doctor....");
		}
		else {
			System.out.println("NO, x is NOT referring to a Doctor....");
		}
		
		System.out.println("---------------------");
		
		if(x instanceof Surgeon) {
			System.out.println("Of course Yes, x is referring to a Surgeon too....");
		}
		else {
			System.out.println("NO, x is NOT referring to a Surgeon ....");
		}
		
		System.out.println("---------------------");
		
		if(x instanceof HeartSurgeon) {
			System.out.println("Of course Yes, x is referring to a HeartSurgeon too....");
		}
		else {
			System.out.println("NO, x is NOT referring to a HeartSurgeon ....");
		}
	 */	
	}
}
//1 exclusive   method
//2 inherited   method
//3 overridden  method
//4 implemented method

class Doctor //Generalization
{
	void diagnose() { // exclusive method | overridden | hidden
		System.out.println("Doctor: diagnose()");
	}
}

class Surgeon extends Doctor // acquired by the Surgeon //Specialization of Generalization
{
	void doSurgery() { //exclusive method
		System.out.println("Surgeon: doSurgery()");
	}
	void diagnose() { // overridding method
		System.out.println("Surgeon: diagnose()");
	}
}

class HeartSurgeon extends Surgeon // acquired by the HeartSurgeon |Specialization of Specialization
{
	void doOpenHeartSurgery() {
		System.out.println("HeartSurgeon: doOpenHeartSurgery()");
	}
	void diagnose() { // overridding method
		System.out.println("HeartSurgeon: diagnose()");
	}
}