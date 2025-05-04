package javapractices;

import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		
		linkedlist.add(10);
		linkedlist.add(5);
		linkedlist.add(7);
		linkedlist.add(10);
		linkedlist.add(30);
		linkedlist.add(50);
		linkedlist.add(null);
		
		/*for(int i=0;i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i));
		}*/
		
		for(Integer l1 : linkedlist) {
			System.out.println(l1);
		}
		

	}

}
