//Abiral Shrestha
import java.util.Scanner;
public class CompareCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter weight and price for package 1");
		double weight1 = sc.nextDouble();
		double price1 = sc.nextDouble();
		System.out.println("Enter weight and price for package 2");
		double weight2 = sc.nextDouble();
		double price2 = sc.nextDouble();
		if ((weight1 / price1)>(weight2 / price2)) { // Diving to find the better ratio
			System.out.println("Package 1 has a better price");
		}
		else if ((weight1 / price1)<(weight2 / price2)) {
			System.out.println("Package 2 has a better price");
		}
		else {
			System.out.println("Two packages have the same price.");
		}
	}

}
