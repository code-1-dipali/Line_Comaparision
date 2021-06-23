package line_comparision;
import java.util.*;

public class Line {
	Point p1, p2;
	
	public double getLength() {
		return Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x))+((p2.y-p1.y)*(p2.y-p1.y)));
	}
	
	public static void main(String args[]) {
		
		Point p1 = new Point();
		p1.x = 4;
		p1.y = 3;
		
		Point p2 = new Point();
		p2.x = 6;
		p2.y = 3;
		
		Line line1 = new Line();
		line1.p1 = p1;
		line1.p2 = p2;
		
		System.out.println("Length of line = "+line1.getLength());
	}
}
