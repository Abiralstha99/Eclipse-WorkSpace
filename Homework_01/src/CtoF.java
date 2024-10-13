import java.util.*;
public class CtoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius, fahrenheit;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your temperature in Celsius: ");
		celsius = sc.nextDouble();
		fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println("The temperature in Fahrenheit is " + fahrenheit);
		sc.close();
		}
	}
