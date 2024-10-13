//Abiral Shrestha
import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int comp = (int) (Math.random()*3);
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter scissor:0, rock:1, paper:2 "); //Enter number for choosing scissor, rock or paper
		int person = sc.nextInt();
		if (person < 0 || person > 2) {
            System.out.println("Invalid input! Please enter 0 for scissors, 1 for rock, or 2 for paper."); // checking the input whether it is 0,1 or 2 or not. 
        } else {
		switch (comp) {
		case 0 :
			System.out.println("The comp did scissors");
			if (person == 1) {
				System.out.println("You Win");
			}
			else if ( person == 0) {
				System.out.println("Draw");
			}
			
			else {
				System.out.println("You loose");
			}
			break;
		case 1:
			System.out.println("The comp did rock");
			if (person==2) {
				System.out.println("You Win");
			}
			else if ( person == 1) {
				System.out.println("Draw");
			}
			else {
				System.out.println("You loose");
			}
			break;
		case 2 :
			System.out.println("The comp did paper");
			if (person==0) {
				System.out.println("You Win");
			}
			else if ( person == 2) {
				System.out.println("Draw");
			}
			else {
				System.out.println("You loose");
			}
			break;
		}
	}

}
} 
