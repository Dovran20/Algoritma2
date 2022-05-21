package hafta_6;

import java.util.*;

public class Sets {

	public static void main(String[] args) {

		
		ArrayList<String> lists=new ArrayList<String>();
		lists.add("masa");
		lists.add("bilgisayar");
		lists.add("kalem");
		lists.add("okul");
		lists.add(3,"dolap");
		lists.add("kalem");
		lists.add("masa");
		
		System.out.println(lists);
		
		Set<String> sets=new HashSet<String>();
		
		sets.add("masa");
		sets.add("bilgisayar");
		sets.add("kalem");
		sets.add("okul");
		sets.add("kalem");
		sets.add("masa");
		
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("dolap"));
		
		sets.clear();
		System.out.println(sets);
		sets.addAll(lists);
		System.out.println(sets);
		System.out.println(lists.get(2));
	}

}
