package javapractices;

public class WrapperClasses {

	public static void main(String[] args) {
		
		WrapperClasses wrapperclasses = new WrapperClasses();
		wrapperclasses.intergerdemo();
		wrapperclasses.Charpro();

	}
	public void intergerdemo() {
		
		// boxing primitive to wrapper
		int a = 10;
		Integer b = Integer.valueOf(a);
		a = b;

		System.out.println(b instanceof Integer);
		System.out.println("" instanceof String);

		// un-boxing wrapper to primitive

		int d = b.intValue();
		System.out.println("unboxing value:" + d);

		String s = "$8230";
		System.out.println(s);

		s = s.replaceAll("[^0-9]", "");

		System.out.println(s);

		System.out.println(s + 10); // 823010

		Integer num = Integer.parseInt(s);

		System.out.println(num + 10); // 8240
		System.out.println("3" + num + 10); // 3823010
		System.out.println("3" + (num + 10)); // 38240

	}

	public void Charpro() {

		// "Welcome To Codemind" + " Technology Pune" + " Maharashtra India""

		String s = "Welcome To Codemind" + " Technology Pune" + " Maharashtra India";

		String ss = "";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isSpace(s.charAt(i))) {
				char ccc = Character.toUpperCase(s.charAt(i + 1));

				ss = ss + ccc;
				i = i + 1;
				continue;

			}
			ss = ss + s.charAt(i);
			
		}
		System.out.println(ss);
	}

}



