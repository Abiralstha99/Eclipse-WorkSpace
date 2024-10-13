//Abiral Shrestha
import java.util.*;
public class WordValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a word:");
		String word = sc.nextLine();
		
		//Converting the entered string to a uniform case
		String upperWord = word.toUpperCase();
		int sum =0;
		
		//Using for loop to access every character
		for (int i=0;i<upperWord.length();i++) {
			
			//Using charAt to access the value of the letter at i position
			char letter = upperWord.charAt(i);
			
			int wordvalue = (int) letter -64;
			
			//incase the user inputs any symbol
			if (wordvalue < 1 || wordvalue > 26 ) {
				wordvalue = 0;
			}
			
			//adding the wordvalue
			else {
				sum = sum + (wordvalue);
			}
		}
		System.out.println("The sum is " + sum);
		sc.close();
	}
}
