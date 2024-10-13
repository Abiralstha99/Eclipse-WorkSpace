//Abiral Shrestha
import java.util.*;
public class InsideRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the (x,y) coordinate: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if ((x <= 5.0 && x>=-5.0) && (y<=(5.0/2) && y>=(-5.0/2))) { // cause there are 4 quadrant and we need to evaluate point in both positive and negative quadrant
			System.out.println("Point ( " + x + " , " + y + " ) lies inside the rectangle");
		}
		else {
			System.out.println("Point ( " + x + "," + y + " ) does not lie inside the rectangle");
		}
	}

}
