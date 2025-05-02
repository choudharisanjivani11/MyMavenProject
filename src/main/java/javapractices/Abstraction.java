package javapractices;

public class Abstraction {
    
	public static void main(String[] args) {
		test1 test1 = new test1();
		System.out.println("Addition of two numbers : " + test1.add(2, 3));
		test1.method1();
	}
}

abstract class Abstrct {

	public Abstrct() {                                                       //constructor from parent class
		System.out.println("constructor from abstrct class");
	}

	public void method1() {                                              //non abstract method
		System.out.println("method without abstract");
	}

	public abstract int add(int a,int b);                              //abstract method
}
class test1 extends Abstrct {

	public test1() {
		System.out.println("constructor from child class");
	}
	public int add(int a,int b) {
		return a+b;

		
	}
}
