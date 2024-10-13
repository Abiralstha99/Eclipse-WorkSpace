//Abiral Shrestha

import java.util.*;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double temp,count,count1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter values for a,b and c from ax^2 + bx + c = 0 "); // asking user for value
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		temp = Math.pow((Math.pow(b,2) - 4*a*c),0.5); // Math.pow always returns a double value
		count = (-b + temp)/(2*a); // Formula i.e root 1
		count1 = (-b - temp)/(2*a); // root 2
		if (temp > 0) {
			System.out.println("The two roots are " + count + " and " + count1);
		}
		
		else if (temp == 0) {
			System.out.println("The root is " + count);
		}
		
		else {
			System.out.println("The equation has no real roots");
		}
	}
}
