package javapractices;

public class StringClassMethods {

	public static void main(String[] args) {
		
/*		int aa=10;
	String s1=String.valueOf(aa);
	System.out.println(s1.length());*/
	
	String s="Welcome to codemind";
	
	System.out.println("character at specified index is: " +s.charAt(9));
	
	System.out.println(s.concat(" technology "));
	
	System.out.println(s.compareTo("technology")); //W=87- t=116 = -29
	
	System.out.println(s.compareTo("Welcome to codemind")); //W=87 =0
	
	System.out.println(s.compareTo("Technology")); //W=87 T=84 =3
	
	System.out.println(s.compareToIgnoreCase("welcome to codemind")); 
	
	System.out.println(s.compareToIgnoreCase("Technology"));
	
	System.out.println(s.contains("come"));  //come contains in the string so its true
	
	System.out.println(s.contains("mdin"));  //mdin not contains in the string so its false
    
	System.out.println(s.endsWith("mind"));   //true
	
	System.out.println(s.equals("welcome to codemind")); //compare given string w is small so its false
      
	System.out.println(s.equalsIgnoreCase("welcome to codemind"));  //ignorecase true
	
	System.out.println(s.indexOf('o'));   //index of char o in given string is 4
	
	System.out.println(s.indexOf("codemind"));  //index of string codemind is 11
	
	System.out.println(s.indexOf('m', 11)); // upto 11 index ignore m then print index of m is 15
	
	System.out.println(s.isBlank()); //string is not blank have character n spaces so False
	
	System.out.println("".isBlank()); //created object by "" string is blank so true   //blank or white spaces=true
	
	System.out.println("  ".isBlank()); //created object by "" string have spaces so true
	
	System.out.println(s.isEmpty()); //string is not empty so false
	
	System.out.println("".isEmpty()); //string is empty no sapces n char so true
	
	System.out.println(" ".isEmpty()); //string is not empty have white sapces so false
	
	System.out.println(s.lastIndexOf('o'));  // 12 from last 
	
	System.out.println(s.length());         //19 with character n white spaces
	
	System.out.println(s.replace('m', 'M'));  //REPLACE m  WITH M  welcoMe to codeMind
	
	System.out.println(s.replace("me", "ME"));  // welcoME to codemind
	
	String ss= "147$AB%cd&456";
	
	System.out.println(ss.replaceAll("[0-9]", "")); //print only $AB%cd&
	
	System.out.println(ss.replaceAll("[^0-9]", "")); //only numbers 147456
	
	System.out.println(ss.replaceAll("[A-Z]", "")); //removed Uppercase letter 147$%cd456
	
	System.out.println(ss.replaceAll("[a-z]", "")); //removed lowercase letter 147$AB%456
	
	System.out.println(ss.replaceAll("[0-9A-Za-z]", "")); //only print special character $%&
	
	System.out.println(ss.replaceAll("[^0-9A-Za-z]", "")); //print without spcl char 147ABcd456
	
	 String a[]=s.split(" ");
	 
	 for (String sss : a) {
		 System.out.println(sss);
		 
	 }
	 
	}

}
