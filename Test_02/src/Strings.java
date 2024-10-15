/*
 * abiral shrestha
 */
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "hello world ! ";
		System.out.println(greeting);
		
		//String concatenatipn
		String name = "I am Harry";
		System.out.println(greeting + "\n" + name);
		
		//Using the charAt function 
		System.out.println(name.charAt(2)); //prints the value that is at index 2
		
		//Length of the string
		System.out.println(name.length()); //counts 1 for space
		
		//Comparing two strings
		String value1 = "Nepal";
		String value2 = "nepal";
		if (value1.equalsIgnoreCase(value2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		int count = (value1.compareTo(value2));
		System.out.println(count);
		
		//prints in Uppercase
		System.out.println(value1.toUpperCase());
		
		//next() and nextLine()
		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter a word ");
		// String input = sc.next(); // takes only a single word as input
		// System.out.println(input);
		
//		String input = sc.nextLine(); //takes the whole sentence as a input
//		System.out.println(input);
		
		//printf
//		char fill = 'a';
//		System.out.printf("%s is %c %n rockstar", input,'c'); //%n inserts a new line
		
		System.out.printf("Number:%.2f",(float)42);
		
		System.out.printf("\nNumber:%-3d%n",42);
		
		 System.out.printf("%-15s %-5s%n", "Student Name", "Score");
	        System.out.println("-------------------------"); // A separator line
	        String[] names = {"Alice", "Bob", "Charlie", "David"};
	        int[] scores = {95, 85, 78, 88};
	        for (int i =0;i<4;i++) {
	        	System.out.printf("%-15s %d%n",names[i],scores[i]); // -15 means :  The - indicates left alignment, and 15 specifies that the string will take up a width of 15 characters. If the name is shorter than 15 characters, spaces will be added to the right.
	        }
		
		
	}

}
