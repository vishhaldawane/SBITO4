
public class InstrumentTest {
	public static void main(String[] args) {
//		MusicalInstrument mi = new MusicalInstrument();
//		StringBasedMusicalInstrument  sbmi = new StringBasedMusicalInstrument();
		Guitar g = new Guitar();
		g.play();
		g.tuneStrings();
		g.pluck();
		
	}
}

abstract class MusicalInstrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument 
{
	void tuneStrings() {
		System.out.println("Tuning the guitar strings....");
	}
	void play() {
		System.out.println("Playing guitar.....");
	}
	void pluck() {
		System.out.println("Plucking the strings of the guitar....");
	}
}
class Violin extends StringBasedMusicalInstrument 
{
	void tuneStrings() {
		System.out.println("Tuning the Violin strings....");
	}
	void play() {
		System.out.println("Playing Violin .....");
	}
	void bowing() {
		System.out.println("Bowing the strings of the violin....");
	}
}
class ElectricGuitar extends Guitar
{
	
}
