package CollectionFrameWorkMyOwnWork;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		
		hashMap.put(1, "C");
		hashMap.put(2, "Java");
		hashMap.put(3, "Php");
		hashMap.put(4, "Python");
		hashMap.put(5, "C#");
		
		System.out.println(hashMap.toString());
		
		for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			System.out.println("key : "+entry.getKey()+"  value: "+entry.getValue());
		}

	}

}
