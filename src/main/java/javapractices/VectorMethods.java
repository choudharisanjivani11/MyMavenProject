package javapractices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		
		Vector<Integer> a1=new Vector<Integer>();
		
		a1.add(11);
		a1.add(14);
		a1.add(12);
		a1.add(15);
		a1.add(null);
		a1.add(12);
		
		// Appends the specified element to the end of this list. 
		
		Vector<Integer> a2=new Vector<Integer>();
		a2.add(13);
		a2.add(16);
		
		System.out.println(a1);
		//a1.addAll(a2);
		//System.out.println(a1);
		a1.add(1, 13);
		System.out.println(a1);     //o/p [11, 13, 14, 12, 15, null, 12]
		a1.add(4, 16);
		System.out.println(a1);       // [11, 13, 14, 12, 16, 15, null, 12]
		System.out.println("************************************"); 
		
		// Returns the number of elements in this list.
		System.out.println("Size of list :" + a1.size());  
		
		System.out.println("************************************");
		
		// Returns true if this list contains the specified element
		System.out.println("a1 contains null : " +a1.contains(null));
		System.out.println("a1 contains 13 : " +a1.contains(13));
		
		System.out.println("************************************");
		System.out.println("a1 contains a2 : " +a1.containsAll(a2));
		
		System.out.println("************************************");
		System.out.println("object from index 3:" + a1.get(3));
		
		System.out.println("************************************");
		System.out.println("index of object null :" + a1.indexOf(null));
		
		// Returns true if this list contains no elements
		System.out.println("a1 list is empty: " +a1.isEmpty());
		
		System.out.println("************************************");
		// remove element using index
		a1.remove(7);
		System.out.println(a1);
		
		Vector<String> a3=new Vector<String>();
		
		a3.add("welcome");
		a3.add("to");
		a3.add("codemind");
		a3.remove("to");
		
		System.out.println("a3 elements list :" +a3);
		
		System.out.println("************************************");
		
		// Removes all of the elements from this list
		System.out.println(a1);
		
		System.out.println("************************************");
		
		Vector<Integer> a4=new Vector<Integer>();
		
		a4.add(15);
		a4.add(13);
		a4.add(20);
		
		System.out.println(a4);
		
		a1.removeAll(a4);
		
		System.out.println(a1);
		
		System.out.println("************************************");	
		
		List<Integer> l5=a1.subList(1, 5);
		
		System.out.println(l5);
		
		System.out.println("************************************");
		System.out.println(a1);
		System.out.println("*******I*****************************");
		
		//Iterator<Integer> it1=a1.iterator();
		
		/*while(it1.hasNext()) {
			System.out.println(it1.next());
		}*/
		
		for(Integer a :a1) {
			System.out.println(a);
		}
		System.out.println("************************************");
		a1.clear();
		System.out.println(a1);
	}

}
