package javapractices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {

	public static void main(String[] args) {
		
		HashSet<String> hashset=new HashSet<String>();
		
		hashset.add("Sanju");
		hashset.add("Athu");
		hashset.add("Digs");
		hashset.add("Mom");
		hashset.add("Digs");
		hashset.add(null);
			
	//	for (String ss:hashset) {        //can use for loop instead for Iterator
	//		System.out.println(ss);
	//	}

        Iterator<String> iterator = hashset.iterator();
        
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
	}

}
