package javapractices;

import java.util.ArrayList;

public class ArrayListImpl {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 =new ArrayList<Integer> ();
		
		al1.add(10);
		al1.add(30);
		al1.add(40);
		al1.add(10);
		al1.add(null);
		al1.add(50);
		al1.add(20);
		
		for (Integer integer :al1) {
			                                    //I used for each loop
			System.out.println(integer);
		}

		/*for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
	     } */
		
	}

}
