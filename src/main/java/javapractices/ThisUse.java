package javapractices;

public class ThisUse {
	//instance member variable                      //instance member variable and method belongs to object we need to create object to call them
	int a=10;
	static int b=20;
		
	//static member function                        //static member variable and function belongs to class we can call with .classname
	public static void main(String[] args) {
		
		ThisUse t= new ThisUse();
		
          System.out.println(t.a + ThisUse.b);        // b called with classname
          
	}
	
	//instance member function
	public void test() {
		
		System.out.println("Instance member function");
		
	}
}
