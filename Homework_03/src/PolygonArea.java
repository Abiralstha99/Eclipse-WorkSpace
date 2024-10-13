//Abiral Shrestha
import java.util.*;
public class PolygonArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter no of sides of polygon: "); // taking sides as input
		int n = sc.nextInt();
		System.out.println("Enter the length of side: ");  // taking length of sides as input
		double s = sc.nextDouble();
		double numerator = (n * Math.pow(s, 2));
		double denominator = 4 * (Math.tan(Math.PI/n));
		double ans = numerator/denominator;
		System.out.println("The area of the polygon is: " + ans);
	}
}
