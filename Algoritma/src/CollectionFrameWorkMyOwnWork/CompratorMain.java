package CollectionFrameWorkMyOwnWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class BuyuktenKucugeString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}









public class CompratorMain {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Ada");
		list.add("Fortan");
		list.add("C++");
		list.add("C");
		list.add("C#");
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, new BuyuktenKucugeString());
		System.out.println(list);
	}

}
