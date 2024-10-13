//Abiral Shrestha
import java.util.*;
public class FutureDates {
	public static void main (String[] args) {
		System.out.println("Enter an integer for today's day of the week \n Sunday = 0\n Monday = 1\n Tuesday = 2\n Wednesday = 3\n Thrusday = 4\n Friday = 5\n Saturday = 6 ");
		Scanner sc = new Scanner (System.in);
		int today = sc.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int daypassed = sc.nextInt();
		int futureDay = (today + daypassed) % 7; // %7 will give the remainder which will be the day of the week
		 
		  System.out.print("Today is ");   // printing today using if-else
	        if (today == 0) {
	            System.out.print("Sunday");
	        } else if (today == 1) {
	            System.out.print("Monday");
	        } else if (today == 2) {
	            System.out.print("Tuesday");
	        } else if (today == 3) {
	            System.out.print("Wednesday");
	        } else if (today == 4) {
	            System.out.print("Thursday");
	        } else if (today == 5) {
	            System.out.print("Friday");
	        } else if (today == 6) {
	            System.out.print("Saturday");
	        } else {
	            System.out.print("Invalid day");
	        }

	       
	        System.out.print(" and the future day is ");   // Display future day using if-else
	        if (futureDay == 0) {
	            System.out.println("Sunday.");
	        } else if (futureDay == 1) {
	            System.out.println("Monday.");
	        } else if (futureDay == 2) {
	            System.out.println("Tuesday.");
	        } else if (futureDay == 3) {
	            System.out.println("Wednesday.");
	        } else if (futureDay == 4) {
	            System.out.println("Thursday.");
	        } else if (futureDay == 5) {
	            System.out.println("Friday.");
	        } else if (futureDay == 6) {
	            System.out.println("Saturday.");
	        } else {
	            System.out.println("Invalid day.");
	        }

	}
}
