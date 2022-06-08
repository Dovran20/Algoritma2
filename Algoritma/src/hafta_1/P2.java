package hafta_1;

import java.util.Arrays;

public class P2 {

	public  static void myster(int x,int[] y) {
		x+=1;
		y[x]+=1;
		System.out.println(x+" "+Arrays.toString(y));
	}

	public static void main(String[] args) {
		int x=0;
		int[] y=new int[4];
		x+=1;
		myster(x, y);
		System.out.println(x+" "+Arrays.toString(y));// 1  0 0 1 0
		x+=1;
		myster(x, y);
		System.out.println(x+" "+Arrays.toString(y));// 2  0 0 1 1
	}
}
