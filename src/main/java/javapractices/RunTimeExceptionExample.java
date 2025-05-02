package javapractices;

public class RunTimeExceptionExample {

	public static void main(String[] args) {

		RunTimeExceptionExample RunTimeException = new RunTimeExceptionExample();
		System.out.println(" Division :" + RunTimeException.div(100, 10));
		// System.out.println(" Division :" + RunTimeException.div(100, 0));                //Arithmatic exception
		
		RunTimeException.stringlength("Welcome to My world");
		// RunTimeException.stringlength(null);                            //nullpointerexception
		
		int num=RunTimeException.ConvertStringtoNumber("10");
		System.out.println("square of number :" +(num*num));
		//RunTimeException.ConvertStringtoNumber("10san");           //NumberFormatException
		
		System.out.println("character at index :" +RunTimeException.getcharacter("Sanjivani choudhari", 11));    //length of string 19
		//System.out.println("character at index :" +RunTimeException.getcharacter("Sanjivani choudhari", 20));   //StringIndexOutOfBoundsException
	
		System.out.println("Get string from provided index :" + RunTimeException.getstringfromindex(1));          //index 1 to 3
		//System.out.println("Get string from provided index :" + RunTimeException.getstringfromindex(5));  //ArrayIndexOutOfBoundsException
	
	
	
	}
     public char getcharacter(String s ,int index) {
    	System.out.println(" String length :" + s.length());
		return s.charAt(index);	 
     }
	public int div(int a, int b) {
		return a / b;
	}

	public void stringlength(String s) {
		System.out.println(" String length :" + s.length());
	}
	
	public int ConvertStringtoNumber(String s) {
		return Integer.parseInt(s);	
	}
	
	public String getstringfromindex(int index) {
		String arr[]= {"sanju" ,"Athu" , "Ram","sham"};
		return arr[index];
		
	}
}
