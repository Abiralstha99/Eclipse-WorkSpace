//Abiral Shrestha
import java.util.*;
public class NumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter a positive integer: "); // taking input
	    int num = sc.nextInt();
	    for (int i = 1;i<=num;i++) {
	    	if (i!=num) {
	    	System.out.print(i +","); 
	    }
	    	else {
	    		System.out.print(i); // using if else case because we do not need comma after last number
	    	}
	
	  }
	    sc.close();
  }
}
