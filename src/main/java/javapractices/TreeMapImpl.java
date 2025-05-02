package javapractices;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapImpl {

	public static void main(String[] args) {
		
		TreeMap<Long, String> map =new TreeMap<Long, String>();
		
		map.put(324562155245L, "Sanju");
		map.put(324562155246L, "Athu");
		map.put(324562155256L, "Virat");
		map.put(324562155248L, "Rahul");
		map.put(324562155246L, "Athu");
		map.put(324562155233L, "Radha");
		//map.put(null, null);                      //Single null key not allowed
		map.put(324562155632L, null);
		
		
		Set<Entry<Long ,String>> set=map.entrySet();
		
		Iterator<Entry<Long ,String>> iterator= set.iterator();
		
		while(iterator.hasNext()) {
			Entry<Long ,String> ee= iterator.next();
		//	System.out.println(ee);
			System.out.println(ee.getKey() +":" + ee.getValue());
		}

		//class cast exception
		TreeMap tmap =new TreeMap();
		tmap.put(34567854555L, "Sachin");
		tmap.put("virat", "Sachin");
		tmap.put(new Student("Sachin",12,'C'), "Rohit");
		
		Set<Entry<Object , Object>> e= tmap.entrySet();
		
		for(Entry<Object,Object> o :e) {
			Object oo=o.getKey();
			oo.equals("abc");
		}
		
	}

}
