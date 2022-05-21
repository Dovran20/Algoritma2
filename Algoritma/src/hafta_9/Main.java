package hafta_9;

import java.util.*;

public class Main {

	public static boolean validPolindrome(String str) {
		 Stack<Character> stack=new Stack<Character>();
	        for(int i=0;i<str.length();i++) {
	        	stack.add(str.charAt(i));
	        }
	        boolean flag=true;
	        for(int i=0;i<str.length();i++) {
	        	if(stack.pop()!=str.charAt(i)) {
	        		flag=false;
	        	}
	        }
		
		return flag;
	}

	public static void main(String[] args) {
     
	List<Integer> list=new ArrayList<Integer>();
       
  
		
	
	}
	
	public static ArrayList<Integer> fibonacci(int number){
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0, 1);
		list.add(1, 1);
		for(int i=2;i<number;i++) {
			list.add(i, list.get(i-1)+list.get(i)-2);	
		}
		return list;
	}

}
