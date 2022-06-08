package hafta_1;

public class P1 {
	
	public static String myster(int a,int b) {
		if(a*2<b) {
			a*=3;
		}
		else if(a>b) {
			b+=3;
		}
		if(b<a) {
			b++;
		}
		else {
			a++;
		}		
		return a+" "+b;
	}	
	public static void main(String[] args) {		
		String x;
		x=myster(10,2);
		System.out.println(x); // 10  6
		x=myster(3,8); 
		System.out.println(x); // 9  9
		x=myster(4,4);
		System.out.println(x); // 5  4
		x=myster(10,30);
		System.out.println(x); // 31  30
	}
}
