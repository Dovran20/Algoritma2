package hafta_6;

import java.io.*;
import java.util.*;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
  
		countWords();
		
	}
	
	public static void countWords() throws FileNotFoundException {
		Scanner file=new Scanner(new File("C:\\Users\\Lenovo\\git\\Algoritma_hafta_2\\Algoritma\\src\\hafta_6\\test.txt"));
		Set<String> words=new HashSet<String>();
		while(file.hasNext()) {
			String word=file.next().toLowerCase();
			words.add(word);
		}
		
		System.out.println("Kelimeler "+words);
		System.out.println("Kelime sayýsý "+words.size());
		
		for(String w :words) {
			System.out.println(w);
		}
	}

}
