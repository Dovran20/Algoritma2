package hafta_5;

import java.util.ArrayList;
import java.util.Iterator;

public class StarAdd {

	public static void main(String[] args) {

		ArrayList<String> words= new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("bart�n");
		words.add("kitap");
		
		System.out.println("d�ng� �ncesi:"+words);
		System.out.println("liste uzunlu�u:"+words.size());
       
		for(int index=0;index<words.size();index+=2) {
			words.add("*");
		}
		System.out.println("d�ng� �ncesi:"+words);
		System.out.println("liste uzunlu�u:"+words.size());
		
		for(int index=0;index<words.size();index+=2) {
			words.remove(index);
		}
		
		System.out.println("d�ng� �ncesi:"+words);
		System.out.println("liste uzunlu�u:"+words.size());
	}

}
