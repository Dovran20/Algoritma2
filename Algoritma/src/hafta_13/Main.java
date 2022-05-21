package hafta_13;

import java.util.Arrays;

public class Main {
	
	public static int sequentialSearch(int[] Array,int target) {
		
		for(int index=0;index<Array.length;index++) {
			if(Array[index]==target) {
				return index;
			}
		}
		return -1;
	}

	
	public static int binarySearchR(int[] array,int target,int min,int max) {
		
		if(min>max) {
			return -1;
		}
		else {
			int mid=(min+max)/2;
			if(array[mid]<target) {
				return binarySearchR(array, target,mid+1,max);
			}
			else if(array[mid]>target) {
			    return binarySearchR(array, target, min, mid-1);
			}
			else {
				return mid;
			}
		}
	}
	public static void main(String[] args) {
		
		
		
          Arrays.binarySearch(args, args);
		int[] numbers= {1,3,45,32,23,12,65,12,7};
		int[] array= {1,3,7,12,23,32,65};
		//int index=sequentialSearch(numbers, 23);
		//int index=indexOf(array, 23);
		int index=binarySearchR(array,1,0,array.length-1);
		if(index!=-1) {
			System.out.println("Aranan elemanın index numarası: "+index);
		}
		else {
			System.out.println("Eleman bulunamadı !");
		}
		
	}
	
	
	public static int binarySearch(int[] array, int target) {
		int min=0,max=array.length-1;
		int mid;
		while(min<=max) {
			mid=(max+min)/2;
			if(array[mid]<target) {
				min=mid+1;
			}
			else if(array[mid]>target) {
				max=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static String binarySearch(String[] strings,String string) {
		
		int min=0,max=strings.length-1;
		int mid=(min+max)/2;
		while(min<=max) {
			if(!strings[mid].equals(string) && mid<min) {
				min=mid;
			}
			//else if(!strings[mid].equals(string) && max)
		}
		return null;
	}
	
	
	public static int indexOf(int[] Array,int target) {
		int i=0;
		while(i<Array.length && Array[i]<=target) {
			if(Array[i]==target) {
				return i;
			}
			else {
				i++;
			}	
		}	
		return -1;
	}

}
