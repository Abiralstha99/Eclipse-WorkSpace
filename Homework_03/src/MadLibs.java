//Abiral Shrestha
import java.util.*;
public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a place: ");
		String place = sc.nextLine(); // taking input
		System.out.println("Enter an adjective: ");
		String adj = sc.nextLine();
		System.out.println("Enter a noun:");
		String noun = sc.nextLine();
		System.out.println("Enter a plural noun:");
		String pnoun = sc.nextLine();
		System.out.println("Enter a verb ending in \"ing\": ");
		String verb = sc.nextLine();
		System.out.printf("Today I walked into the %s to find that all of the computers were off. \n"
				+ " I was %s. Not only did I lose a critical %s, \n"
				+ " but the room had gotten cold. Those %s did a great job \n"
				+ " %s the area." , place, adj, noun, pnoun, verb); // using printf to print the output
	}

}
