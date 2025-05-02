package javapractices;

public class StringPrograms {

	public static void main(String[] args) {
		
		//String str ="codemind";
		// Accessing single character from string 
		
	/*	System.out.println("character at 0th index : " + str.charAt(0));
		System.out.println("character at 1th index : " + str.charAt(1));
		System.out.println("character at 2th index : " + str.charAt(2));
		System.out.println("character at 3th index : " + str.charAt(3));
		
		System.out.println("length of given string : " + str.length()); //length of string
			
		for(int i=0;i<str.length();i++) {      //printing string character using loop
	
		System.out.println(" " + str.charAt(i));  
		}
	
		for(char c :str.toCharArray()) {     //for each loop
			
			System.out.println(c);  
		}
		
		//Iterating half string 
	
		
		for(int i=0;i<str.length()/2;i++) {
			//System.out.println(" " + str.charAt(i));	
		}
		 string Reverse
		
		for (int i=str.length()-1;i>=0;i--) {
			
		System.out.println(str.charAt(i));
		} 
		//accessing from half e.g "mind"
		
		for(int i=str.length()/2;i<str.length();i++) {
			System.out.println(str.charAt(i)); 
		} */
		
		//find vowels from string "codemind"// "aeiou"
		String str ="codemind";
		/*	String vowels="aeiou";
		int count = 0;
		System.out.println("vowels in string : ");
		
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(vowels.indexOf(ch)!= -1) { // Check if character is a vowel
				
				System.out.println(ch);
				count++;
			}
			
		}
		System.out.println("count of vowels : " +count);	*/
		
		//print character occurance of d 
		
			//char ch='d';
		int count=0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='d') {
				count++;
			
			}
		}
		System.out.println("occurance of d :"+count);
		
		//Replace d from D in string "codemind"
		/*	  char ch='d';   // Character to replace
		  char ch1='D';     // Replacement character
		  
		  String replacestr=str.replace(ch, ch1);  // Replace 'd' with 'D
		System.out.println("modified string : " + replacestr); */
	}
}


