package javapractices;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethods {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();

		// Appends the specified element to the end of this list.
		
		h1.add(100);
		h1.add(200);
		h1.add(300);
		h1.add(400);
		h1.add(null);
		h1.add(300);
		
		LinkedHashSet<Integer> h2=new LinkedHashSet<Integer>();
		h2.add(500);
		h2.add(600);
		
		System.out.println(h1);
		h1.addAll(h2);		
		System.out.println(h1);
		System.out.println("************************************");
		
		//Return the number of element in set 
		System.out.println("size of set:" + h1.size());
		System.out.println("************************************");
		
		// Returns true if this set contains the specified element.
		System.out.println("h1 contains 200 : " + h1.contains(200));
		System.out.println("h1 contains 60 : " + h1.contains(60));
		System.out.println("************************************");
		System.out.println("h1 contains h2 : " + h1.containsAll(h2));
		
		// Returns true if this set contains no element.
		System.out.println("h1 is empty : " + h1.isEmpty());
		System.out.println("************************************");
		
		Set<String> h3 = new LinkedHashSet<>();

		h3.add("sachin");
		h3.add("saurav");
		h3.add("hardik");
		h3.remove("hardik");                        //remove element
		System.out.println("H3 elements = \n" + h3);
		System.out.println("************************************");
		
		//Remove all elements
		System.out.println(h1);
		System.out.println("************************************");
		
		LinkedHashSet<Integer> h4 = new LinkedHashSet<>();
		h4.add(100);
		h4.add(200);
		h4.add(300);
		
		h1.removeAll(h4);
		System.out.println(h1);
		System.out.println("************************************");	
		
		Iterator<Integer> iterator=h1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("************************************");
		
		h1.clear();
		System.out.println(h1);
}
}
