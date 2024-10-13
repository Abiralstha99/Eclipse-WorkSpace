//Abiral Shrestha
import java.util.*;
public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		//declaring a variable word 
		String word = "";
		int count = 0;
		
		//using while loop and putting a condition that if it equals "," then the loop ends
		while (!word.equals(".")) {	
		System.out.println("Enter a word:");
		word = sc.next();
		
		//using a count variable to count the number of loop
		count++;
		}
		System.out.printf("You entered %d words",(count-1) );
	}

}
