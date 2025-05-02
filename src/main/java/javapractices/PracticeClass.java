package javapractices;

public class PracticeClass {
	
	public void method1() {
		System.out.println("My method in PracticeClass class");	
	}


public static void main(String[] args) {

	MathTest mathtest = new MathTest();
	mathtest.addition(10, 20);
	System.out.println(mathtest.substraction(50, 25));

}
}
