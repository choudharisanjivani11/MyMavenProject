package javapractices;

 
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1class P= new Child1class();
		System.out.println(P.profession);
		P.extremehappy();
		P.Engineer();
		
	}
}
 class Parentclass {
	 
	 String surname="Choudhari";
	 String profession= "farmer";
	 
	 void extremehappy() {
		 System.out.println("Parents are extremehappy");
	}
	 
 } 
 class Child1class extends Parentclass { 
	 String gender ="Female";		 
	 void Engineer() {
		 System.out.println("Child1 is Engineer and Happy");
		 
	 } 
 }
 class grandchildclass extends Child1class {
	 
	 void Doctor() {
		 System.out.println("child2 is Doctor and Happy"); 
 }
 }
	