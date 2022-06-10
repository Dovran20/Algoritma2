package CollectionFrameWorkMyOwnWork;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HarfFrekanz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Cümle giriniz:");
        String str=sc.nextLine();
        
        Map<Character,Integer> frekans=new TreeMap<Character,Integer>();
         
        for (int i = 0; i < str.length(); i++) {
			Character ch=str.charAt(i);
			if(frekans.containsValue(ch)) {
				frekans.replace(ch, frekans.get(ch)+1);
			}
			else {
				frekans.put(ch, 1);
			}
		}
        
        for (Map.Entry<Character, Integer> entry:  frekans.entrySet()) {
			System.out.println("Karakter: "+entry.getKey()+" "+entry.getValue()+" defa geçiyor");
		}
        
	}

}
