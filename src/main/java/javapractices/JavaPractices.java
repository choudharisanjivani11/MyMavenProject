package javapractices;

public class JavaPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int arr[] = { 1, 2, 3, 5, 2, 3, 5 }; // find duplicate elements
		//int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate elements : " + arr[i]);
					//count++;
					break;
				}
				
			}
		//	System.out.println("Duplicate elements counts :" + count);
		} */
	/*	a. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
		d. 5 + 15 / 3 * 2 - 8 % 3
		Expected Output :
		43
		1
		19
		13 */
		
		int i=5, x=15;
		int j=3, n=2;
		int  m=8;
		int l=i+x/j*n-m%j;
		System.out.println("output of given number :" + l);
		System.out.println(-5+8*6);
	System.out.println(5 + 15 / 3 * 2 - 8 % 3);	
	int g= -5+8*6;
	System.out.println(g);
		
	}
}
