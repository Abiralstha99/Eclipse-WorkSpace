import java.util.*;
public class Distance {
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the coordinates (x1, y1): ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter the coordinates (x2, y2): ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		int sum = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
		double distance = Math.sqrt(sum);
		System.out.println("The distance is " + distance);
		sc.close();
	}
}
