package javapractices;

public class Encapsulation {

	public static void main(String[] args) {
		enclapsule E= new enclapsule();
		E.setA(25);
		System.out.println("Value set " + E.getA());
		E.setB(50);
		System.out.println("Value set " +E.getB());	    
	}
}
class enclapsule {
	
	int a ;
	int b;
	
	public int getA() {                        //write access
		return a;
		
	}
	public void setA(int a) {               //read access
		this.a = a;
	}
	public int getB() {
		return b;
		
	}
	public void setB(int b) {
		this.b =b;
		
	}
}

