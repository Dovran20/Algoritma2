package CollectionFrameWorkMyOwnWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAndArrayList {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		zamanHesapla("LinkedList", linkedList);
		zamanHesapla("ArrayList", arrayList);
	}
	
	public static void zamanHesapla(String type,List list) {
		
		long start,end;
		
		start=System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.add(0,i);
		}
		end=System.currentTimeMillis();
		
		System.out.println(type+" working time: "+(end-start)+"ms");
	}

}
