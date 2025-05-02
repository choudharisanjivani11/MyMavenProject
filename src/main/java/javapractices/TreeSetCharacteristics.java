package javapractices;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCharacteristics {

	public static void main(String[] args) {
		
		TreeSet<Integer> t1=new TreeSet<Integer>();
		
		t1.add(10);
		t1.add(20);
		t1.add(50);
		t1.add(20);
		t1.add(40);
	//	t1.add(null);          //null insertion not allowed in treeset
		
		Iterator<Integer> iterator =t1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
