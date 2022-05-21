package hafta_6;

import java.util.*;

public class PointMain {

	public static void main(String[] args) {
		
		Set<Point> points=new HashSet<Point>();
		
		points.add(new Point(3,7));
		points.add(new Point(2,5));
		points.add(new Point(4,9));
		points.add(new Point(1,7));
		points.add(new Point(3,7));
		
		System.out.println(points);
		
		for(Point point: points) {
			System.out.println(point.getX()+" "+point.getY());
		}
 
	}

}
