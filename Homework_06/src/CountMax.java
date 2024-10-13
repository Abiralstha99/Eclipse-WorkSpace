/*
 * Abiral Shrestha
 */
import java.util.*;
public class CountMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int count = 1; //initialize count to 1
		System.out.println("Enter numbers");
		int number = sc.nextInt();
		int max = number; //set first number as max
		while (number != 0 ) { //end the loop once user inputs number as 0
			number = sc.nextInt();
			if (number > max) { //if input number is greater than max then exchange the value
				max = number;
				count = 1; 
			} 
			else if (number == max){
				count++;  //setting a count value to know how many times it was repeated
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}
}
