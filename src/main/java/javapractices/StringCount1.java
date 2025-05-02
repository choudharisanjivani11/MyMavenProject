package javapractices;

public class StringCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Welcome to zest india";  // 'c' 'e' and spaces
		int count = 0;
		int countc = 0;
		int counte = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				count++;
			}
			if (s1.charAt(i) == 'c') {
				countc++;
			} else if (s1.charAt(i) == 'e') {
				counte++;
			}
		}
		System.out.println("spaces count is : " + count);
		System.out.println("c count is : " + countc);
		System.out.println("e count is : " + counte);
	}

}
