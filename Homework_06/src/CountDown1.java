/*
 * @abiral shrestha
 */
import java.util.*;
public class CountDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for (int i = n;i>0;i--) {
			for (int j = n ; j>0;j--) {
				System.out.print(j + " "); // since the pattern's column is changing we need to print j 
			}
			System.out.println();
		}
	}

}
