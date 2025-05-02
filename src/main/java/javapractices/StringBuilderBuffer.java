package javapractices;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("Automation Test");

		sb.append(" Engineer");
		
		System.out.println(sb);
		
		System.out.println("****************************");
		
		StringBuffer sb1 = new StringBuffer("Automation Test Engineer");
		
		sb1.reverse();
		
		System.out.println(sb1);

	}

}
