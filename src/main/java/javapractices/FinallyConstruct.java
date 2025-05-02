package javapractices;

public class FinallyConstruct {

	public static void main(String[] args) {
		FinallyConstruct finallyconstruct=new FinallyConstruct();
		char c = finallyconstruct.getCharacterFromSpecifiedindex("Welcome", 20);
		System.out.println("character = " + c);
	}

	public char getCharacterFromSpecifiedindex(String s, int index) {
		char c =0;
		try {
			 c = s.charAt(index); 
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Please provide valid index");
		} catch (ArithmeticException e) {
			
		}
		finally {
			System.out.println("Finally block always excuted");
		}
		return c;

	}
}
