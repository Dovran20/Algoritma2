package hafta_6;

import java.io.*;
import java.util.*;

public class Sets2 {

	public static void main(String[] args) throws FileNotFoundException {
		Set<String> Words=new HashSet<String>();
		Words=read();
       
		System.out.println(Words);
		
		for(String s: read()) {
			Words.add(s);
		}
		
		System.out.println(Words);
	}
	
	public static Set<String> read() throws FileNotFoundException{
		System.out.println("Okumak istediðinz file ismini giriniz:");
		Scanner scanner=new Scanner(System.in);
		String file=scanner.next();
		Scanner input=new Scanner(new File("C:\\Users\\Lenovo\\git\\Algoritma_hafta_2\\Algoritma\\src\\hafta_6\\"+file));
		
		Set<String> word=new HashSet<String>();
		
		while(input.hasNext()) {
			String soz=input.nextLine().toLowerCase();
			word.add(soz);
		}
		
		return word;
	}

}
