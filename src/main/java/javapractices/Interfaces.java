package javapractices;

public class Interfaces {
	public static final int a = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c1 = new Calc();
		c1.addition(11, 10);
		c1.div(81, 9);
		c1.multi();
	}
}
interface Calculator {

	public void addition(int a, int b);        // interface method without body with arguments

	void multi();
}
class Calc implements Calculator {

	public int div(int a, int b) {
		int c = a / b;
		System.out.println("division :" + c);
		return c;
	}
	@Override
	public void addition(int a, int b) {
		System.out.println("Addition :" + (a + b));
	}
	@Override
	public void multi() {
		System.out.println("Multiplication :" + (5 * 6));
	}
}