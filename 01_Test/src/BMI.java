import java.util.*;
public class BMI {
	public static void main (String [] args) {
		int weight, feet, inch ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your weight");
		weight = sc.nextInt();
		System.out.println("Enter your height in feet and inch: ");
		feet = sc.nextInt();
		inch = sc.nextInt();
		int height = feet*12 + inch;
		int  bmi = (weight * 703)/ (int)(Math.pow(height,2));
		System.out.println("Your BMI is : " + bmi);
	}
}
