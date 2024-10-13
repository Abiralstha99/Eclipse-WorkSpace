import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance, miles, price;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the distance to travel: ");
		distance = sc.nextDouble();
		System.out.println("Enter miles per gallon: ");
		miles = sc.nextDouble();
		System.out.println("Enter price per gallon: ");
		price = sc.nextDouble();
		
		double mileage = distance/miles;
		double answer = mileage * price ;
		System.out.println("The total price is: " + answer);
		sc.close();
	}

}
