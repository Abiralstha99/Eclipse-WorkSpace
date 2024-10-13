import java.util.Scanner;

public class Invest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter investment amount: ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter interest rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter number of years: ");
		double years = sc.nextDouble();
		
		double monthlyRate = rate / 100 / 12;
		double count = (1+monthlyRate);
		double temp = years*12;
		Double value = amount * Math.pow(count, temp);
		System.out.println("The Future Value is " + value);
	}

}
