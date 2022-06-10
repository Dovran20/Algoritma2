package CollectionFrameWorkMyOwnWork;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
	
	
	public static void mapWrite(Map<Integer,String> map) {
		map.put(10,"Arslan");
		map.put(20,"Begench");
		map.put(30,"Chary");
		map.put(40,"Dovran");
		map.put(50,"Eziz");
		
	/*	for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("KEY: "+entry.getKey()+" VALUE: "+entry.getValue());
		}*/
		
		//System.out.println(map.keySet());
		
		//System.out.println(map.values());
		Collection<String> values=map.values();
		for (String string : values) {
			System.out.println(values);
		}
		
	}
	

	public static void main(String[] args) {
		
		Map<Integer,String> hashMap=new HashMap<Integer,String>();
		Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();
		Map<Integer,String> treeMap=new TreeMap<Integer,String>();
		
		System.out.println("************************");
		mapWrite(hashMap);
		System.out.println("************************");
		mapWrite(linkedHashMap);
		System.out.println("************************");
		mapWrite(treeMap);
		
		
	}

}
