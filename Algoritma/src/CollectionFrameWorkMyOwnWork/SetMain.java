package CollectionFrameWorkMyOwnWork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		
		Set<String> hashSet=new HashSet<String>();
		Set<String> linkHashSet=new LinkedHashSet<String>();
		Set<String> treeSet=new TreeSet<String>();
		
		hashSet.add("Java");
		hashSet.add("Kotlin");
		hashSet.add("Ruby");
		hashSet.add("Ada");
		hashSet.add("Php");
		
		linkHashSet.add("Java");
		linkHashSet.add("Kotlin");
		linkHashSet.add("Ruby");
		linkHashSet.add("Ada");
		linkHashSet.add("Php");
		
		treeSet.add("Java");
		treeSet.add("Kotlin");
		treeSet.add("Ruby");
		treeSet.add("Ada");
		treeSet.add("Php");
		
		
	/*	System.out.println("HashSet******************************");
		for (String string : hashSet) {
			System.out.println(string);
		}
		
		System.out.println("LinkedHashSet******************************");
		for (String string : linkHashSet) {
			System.out.println(string);
		}
		
		System.out.println("TreehSet******************************");
		for (String string : treeSet) {
			System.out.println(string);
		}*/
		
		/*Set<String> fark=new HashSet<String>();
		fark.add("Go");
		fark.add("Python");
		fark.add("Java");
		System.out.println(fark.removeAll(hashSet));
	    System.out.println(fark);*/
		
		Set<String> fark2=new HashSet<String>();
		fark2.add("Go");
		fark2.add("Python");
		fark2.add("Java");
		System.out.println(fark2.retainAll(treeSet));
		System.out.println(fark2);
	}
}
