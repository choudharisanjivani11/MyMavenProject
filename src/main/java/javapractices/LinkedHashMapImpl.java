package javapractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class LinkedHashMapImpl {

	public static void main(String[] args) {
		
		LinkedHashMap<Long, String> map =new LinkedHashMap<Long, String>();
		
		map.put(324562155245L, "Sanju");
		map.put(324562155246L, "Athu");
		map.put(324562155256L, "Virat");
		map.put(324562155248L, "Rahul");
		map.put(324562155246L, "Athu");
		map.put(324562155233L, "Radha");
		map.put(null, null);
		map.put(324562155632L, null);
		
		
		Set<Entry<Long ,String>> set=map.entrySet();
		
		Iterator<Entry<Long ,String>> iterator= set.iterator();
		
		while(iterator.hasNext()) {
			Entry<Long ,String> ee= iterator.next();
			System.out.println(ee.getKey() +":" + ee.getValue());
		}

	}

}
