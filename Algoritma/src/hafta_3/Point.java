package hafta_3;

public class Point {

	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void translate(int x,int y) {
		this.x+=x;
		this.y+=y;
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
	}
	
	
	
}
