package CollectionFrameWorkMyOwnWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		//ArrayList<String> arraylist=new ArrayList<String>();

		List<String> list=new ArrayList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add(0,"C");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		 list.remove(2);
		
		//list.lastIndexOf(list);
		//list.iterator();
		
		for (String string : list) {
			System.out.println(string);
		}
		
		
	}

}
