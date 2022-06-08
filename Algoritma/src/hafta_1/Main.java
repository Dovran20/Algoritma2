package hafta_1;

import java.util.Arrays;

public class Main {
	
	
	public static int digitSum(int number) {
		int sum=0;
		while(number!=0) {
			sum+=number%10;
			number=number/10;
		}
		return Math.abs(sum);
	}
	
	
	public static int[] append(int[] array1, int[] array2) {
		int[] array=new int[array1.length+array2.length];
	
		for (int i = 0; i < array1.length; i++) {
			array[i]=array1[i];
		}
		int j=array1.length;
		for (int i = 0; i < array2.length; i++,j++) {
			array[j]=array2[i];
		}
		
		return array;
	}
	
	public static boolean isAllVolwels(String word) {
		boolean flag=false;
		Character[] harfler= {'i','I','a','A','e','E','o','O','u','U'};
		for (int i = 0; i < word.length(); i++) {
			flag=false;
			for (int j = 0; j < harfler.length; j++) {
				if(word.charAt(i) == harfler[j]) {
					flag=true;
				}
				
			}
			if(flag==false) {
				break;
			}
			
		}
		return flag;
	}
	
    public static boolean allLes(int[] array1,int[] array2) {
    	
    	if(array1.length!=array2.length) {
    		return false;
    	}
    	for (int i = 0; i < array1.length; i++) {
			if(array1[i]>=array2[i]) {
				return false;
			}
		}
    	return true;
    }
	
	public static void main(String[] args) {
		
		int[] x= {1,2,3,4,5};
		int[] y= {6,7,8,9,6};
		
		//System.out.println(allLes(x, y));
	
      System.out.println(isAllVolwels("aAeiuol"));
	}

}
