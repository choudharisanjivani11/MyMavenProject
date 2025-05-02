package javapractices;

public class ThisExample {

	int a = 10;
	int b = 20;

	public ThisExample() {
		System.out.println("Default constructor");
	}

	public ThisExample(int a) {
		this();
		System.out.println("one parameter constructor");
	}

	public ThisExample(int a, int b) {
		this(10);
		System.out.println(a + b);
		System.out.println("Two parameter constructor");
	}

	public static void main(String[] args) {

		ThisExample thisExample = new ThisExample();
		System.out.println("hashcode via refernece variable :" + thisExample.hashCode());
		thisExample.add();

		ThisExample thisExample1 = new ThisExample();
		System.out.println("hashcode via refernece variable :" + thisExample1.hashCode());
		thisExample1.add();

		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		new ThisExample(10);
		new ThisExample(10,20);
	}

	public void add() {
		int a = 30;
		System.out.println("instance member variable and local member with same name addition =" + (this.a + a));
		System.out.println("instance member variable and local member with same name addition =" + (a + a));
		System.out.println(10 + 20);
		System.out.println("hashcode via this keyword :" + (this.hashCode()));

		this.div();
	}

	public void div() {
		System.out.println(10 / 5);

	}

}
