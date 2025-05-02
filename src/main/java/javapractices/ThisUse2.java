package javapractices;

public class ThisUse2  extends Company {
	
	int dept_id=56856;
	
	
	ThisUse2(){
		super(10);
		System.out.println("this is child constructor");
	}
	public void childmethod() {
		super.method1("Welcome");
		System.out.println("Method of child class emp id:" + super.emp_id);
		System.out.println("Method of child class dept id :" + this.dept_id);
		
	}
	public static void main(String[] args) {
		ThisUse2 d=new ThisUse2(); 
		d.childmethod();
	}
}
class Company {

	int emp_id = 101;
	final int accountnum = 789456554;

	Company(int a) {
		 int b;
		System.out.println("Default constructor");
	}

	public void method() {
		System.out.println("Account number :" + this.accountnum);
		System.out.println("instance method company name is ABC");
	}

	public void method1(String s) {
		System.out.println("second method with parameter");
		this.method();
	}
	
}


