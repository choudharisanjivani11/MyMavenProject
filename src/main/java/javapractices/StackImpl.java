package javapractices;

import java.util.Stack;
import java.util.Vector;

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();

		stack.add(50);
		stack.add(30);
		stack.add(20);
		stack.add(null);
		stack.add(40);
		stack.add(30);
		
	/*	for(Integer s1:stack) {
			System.out.println(s1);
		}*/
		
		for (int i=0;i<stack.size();i++) {
			System.out.println(stack.get(i));
		}

	}

}
