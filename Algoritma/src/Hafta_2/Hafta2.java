package Hafta_2;

import java.lang.reflect.Array;

public class Hafta2 {

	
/*	public static boolean isUnique(int[] Array) {
		boolean flag=true;
		for(int i=0;i<Array.length;i++) {
			for(int j=i+1;j<Array.length;j++) {
				if(Array[i]==Array[j]) {
					flag=false;
				}	
			}
		}
		
		return flag;
	}*/
	
	
	public static boolean denesdirme(int[] A) {
		boolean bayrak=true;
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i]==A[j]) {
					bayrak=false;
				}
			}
		}
		
		return bayrak;
		
	}
	
	public static boolean isSorted(double[] Array) {
		boolean flag=true;
		for(int i=0;i<Array.length;i++) {
			for(int j=i+1;j<Array.length;j++) {		
				if(Array[i]>Array[j]) {
					flag=false;
				}
			}
		}
		return flag;
	} 
	
	public static int[][] matrixAdd(int[][] ArrayA,int[][] ArrayB){
		int[][] ArrayC=new int[ArrayA.length][ArrayB.length];
		for(int i=0;i<ArrayA.length;i++) {
			for(int j=0;j<ArrayB.length;j++) {
				ArrayC[i][j]=ArrayA[i][j]+ArrayB[i][j];
			}
		}
		return ArrayC;
	}
	
	public static double sumTo(double num) {
		
		if(num<0) {
		   throw new IllegalAccessError();
		}
		else if(num==0) {
			return 0.0;
		}
		return 1/num+sumTo(num-1);   	
	}
	
    public static int fibonacci(int number) {
    	
    	if(number==0 || number==1) {
    		return number;
    	}
    	else
    	  return fibonacci(number-1)+fibonacci(number-2);
    }
    
	public static int writeBinary(int decimalNo) {
		 
     if(decimalNo==1) {
    	 return 1;
     }
    
    return decimalNo%2+(writeBinary(decimalNo/2)*10);
	     
	}
	 
	public static int factorial(int number) {
		
		if(number==1) {
			return 1;
		}
		
		return number*factorial(number-1);
	}
	
	
	public static void main(String[] args) {

	
		System.out.println(fibonacci(10));
	}
}

