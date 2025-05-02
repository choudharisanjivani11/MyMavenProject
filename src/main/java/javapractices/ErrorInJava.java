package javapractices;

public class ErrorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception exceptn = new Exception();
		exceptn.method();
	}

}

class Exception {
	public void method() {
		System.out.println("show error exception");
		method();

	}

}
