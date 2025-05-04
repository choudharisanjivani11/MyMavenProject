package javapractices;

import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> vector =new Vector<Integer>();
		
		vector.add(50);
		vector.add(30);
		vector.add(20);
		vector.add(null);
		vector.add(40);
		vector.add(30);
		
	  // for(Integer v1 :vector) {
		//	System.out.println(v1);
		//}
		
		for(int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i));
		}

	}

}
