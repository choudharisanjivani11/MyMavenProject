package javapractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapImpl {

	public static void main(String[] args) {
		Map<Long, String> map =new HashMap<Long, String>();
		
		map.put(324562155245L, "Sanju");
		map.put(324562155246L, "Athu");
		map.put(324562155256L, "Virat");
		map.put(324562155248L, "Rahul");
		map.put(324562155246L, "Athu");
		map.put(324562155233L, "Radha");
		
		Set<Entry<Long ,String>> set=map.entrySet();
		
		Iterator<Entry<Long ,String>> iterator= set.iterator();
		
		while(iterator.hasNext()) {
			Entry<Long ,String> ee= iterator.next();
			System.out.println(ee.getKey() +":" + ee.getValue());
		}

	}

}
