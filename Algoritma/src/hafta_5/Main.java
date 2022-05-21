package hafta_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		ArrayList<String> words=new ArrayList<String>();
		
		ArrayList<String> words2=new ArrayList<String>();
		words2.add("Ahmet");
		words2.add("Myrat");
		
		words.add("Allanur");
		words.add("Dovran");
		words.add(0, "Meret");
        words.set(1, "Allanur Muhametnazarov");
        
        words.addAll(2,words2);
		System.out.println(words.toString());
		
		
		
		
		
		/*
		 * ArrayList<String> list=new ArrayList<>();
		 * 
		 * Scanner file=new Scanner(new
		 * File("C:\\Users\\Lenovo\\JavaCamp\\Recurcife learn\\not.txt"));
		 * 
		 * while(file.hasNext()) { String word=file.next(); list.add(word); }
		 * System.out.println(list.toString());
		 */
		
	}

}
