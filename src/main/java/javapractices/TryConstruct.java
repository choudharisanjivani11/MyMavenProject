package javapractices;

public class TryConstruct {

	public static void main(String[] args) {
		TryConstruct tryc=new TryConstruct();
		tryc.div(100, 10);
         
	}
	
	
	public int div(int a, int b) {
		int div = 0;
		try {
			div =a/b;
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic : please do not divide by zero ");
			
		}catch(RuntimeException e) {                                                                 //bottom up approach parent exception should at bottom child exception at up
			System.out.println("RuntimeException:please do not divide by zero ");
		}
		
		System.out.println("Result : " + div);
		return div;
	}
	public int add(int a, int b) {
		int Result =a+b;
		System.out.println(Result);
		return Result;
		
	}

}
