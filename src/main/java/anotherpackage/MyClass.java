package anotherpackage;

import Subpackage.TestSub;

//import javapractices.MathTest;
//import javapractices.PracticeClass;

import javapractices.*;

public class MyClass extends DemoProtected{
	
	public static void main(String[] args) {
		Abc a1= new Abc();
		a1.method();
		MathTest mathtest=new MathTest();
		System.out.println("Addition from MathTest class : " + mathtest.addition(10, 15));
		PracticeClass practiceclass=new PracticeClass();
		practiceclass.method1();
		
		TestSub testsub = new TestSub();
		testsub.Method2();
		
		
		DemoProtected demoprotected=new DemoProtected();       
		demoprotected.add();
		
		MyClass myclass=new MyClass();
		int d2 = myclass.d;
		myclass.div();
	} 

}
class Abc {
	
	public void method() {
		System.out.println("My method in another package");
	
		
	}
}