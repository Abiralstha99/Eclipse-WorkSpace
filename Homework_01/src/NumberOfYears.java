import java.util.*;
public class NumberOfYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,years,rem,days;
		System.out.println("Enter the total number of minutes: ");
		Scanner sc = new Scanner (System.in);
		min = sc.nextInt();
		years = min / (1440*365);
		rem = min % (1440 * 365); 
		days = rem / 1440;
		System.out.println("The number of years is " + years + " and " + days + " days.");
		sc.close();
	}
}
