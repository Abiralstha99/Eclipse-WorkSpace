/**
 * @author abiral shrestha
 */
public class LetterTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Printing the headers
		System.out.printf("%10s %10s %10s %10s","Letter","Value","Letter","Value");
		//Creating a for loop to print ASCII value
		for (int i = 0; i<26; i++) {
			//Using println to print in every other line
			System.out.println();
			// Using 'a' and then printing others adding 1 to every other value and then same goes for uppercase
			System.out.printf("%10s%10d%10s%10d",(char)('a'+i), (int)('a'+i) ,(char)('A'+i),(int)('A'+i));
		}
	}
}
