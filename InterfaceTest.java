//think 

/*
 * 
 * 					think
 * 					|
 * 		------------------------------
 * 		|			|				|
 * 		past		present		 future
 * 		|							|
 * --------------			------------------
 * |		|				|			|
 * good		bad				good		bad
 * 
 * 
 */


public class InterfaceTest {
	public static void main(String[] args) {
		
	}
}

interface Living {
	void live();
}

interface Dying {
	void die();
}

interface Breathing {
	void inhale() ;
	void exhale();
}
interface Eating {
	void eat();
}
interface Drinking
{
	void drink();
}

abstract class Animal implements Living, Dying, Eating, Breathing
{
	
}
abstract class Reptile extends Animal 
{
	abstract void crawl();
}
abstract class Bird extends Animal
{
	abstract void layEggs();
}
abstract class Mammal extends Animal
{
	abstract void giveBirth();
}

class Human extends Mammal
{
	public void inhale() {
		
	}
	public void exhale() {
		
	}
	public void live() {
		
	}
	public void eat() {
		
	}
	public void die() {
		
	}
	
	void think() {
		
	}
	
	void laughing() {
		
	}
	void giveBirth() {
		
	}
}



interface A
{
	void fun(); //public abstract 
}
interface B
{
	void foo(); //public abstract 
}

class C implements A,B
{

	public void foo() {
	
	}

	public void fun() {

		
	}
	
}














