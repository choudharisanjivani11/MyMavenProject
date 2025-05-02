package javapractices;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
		
		TreeMap<Long, String> map =new TreeMap<Long, String>();
		
		map.put(324562155245L, "Sanju");
		map.put(324562155246L, "Athu");
		map.put(324562155256L, "Virat");
		map.put(324562155248L, "Rahul");
		map.put(324562155246L, "Athu");
		map.put(324562155233L, "Radha");
		
		TreeMap<Long, String> map2 =new TreeMap<Long, String>();
		  map2.put(356485485455L, "Ram");
		  
		  map.putAll(map2);
		
		  System.out.println(map);
		  System.out.println("**************************************");
		  System.out.println("map contains 324562155256L = " +map.containsKey(324562155256L));
		  System.out.println("map contains 324562155242L = " +map.containsKey(324562155242L));
		  
		  System.out.println("**************************************");
		  System.out.println("map contains Sanju = " +map.containsValue("Sanju"));
		  System.out.println("map contains rahul = " +map.containsValue("Rahul"));
		  
		  System.out.println("**************************************");
		  System.out.println(map.get(324562155256L));
		  System.out.println("**************************************");
		  System.out.println("map is empty : " +map.isEmpty());
		  
		  System.out.println("**************************************");
		  
		  Set<Long> keyset =map.keySet();                   //to print key set
		  
		  for(Long a : keyset) {
			  System.out.println(a);
		  }
		  System.out.println("**************************************");
		  
		 // map.remove(324562155248L);
		 // System.out.println(map);
		  map.remove(324562155248L , "Rahul");
		  System.out.println(map);
	  System.out.println("**************************************");  
		  map.replace(324562155256L, "Abhis");
		  System.out.println(map);
		  
		  System.out.println("**************************************");
		 System.out.println("size of map : "+ map.size()); 
		 
		 System.out.println("**************************************");
		 
		 Collection<String> values = map.values();
		 
		 Iterator<String> iterator1 = values.iterator();
		 
		 while(iterator1.hasNext()) {
			 System.out.println(iterator1.next());
		 }
		 System.out.println("**************************************");
		 map.clear();
		 System.out.println(map);
		 System.out.println(map.size());
		  
	}

}
