/*
 * Abiral Shrestha
 */
import java.util.*;
public class CountDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for (int i = 0;i<n;i++) {
			for (int j = n ; j>i;j--) {  // changing the condition of loop to get the required output
				/*
				 * since we need n lines of pattern i iterates n times
				 * now since we need change in j 
				 * 
				 * i           j           j>i           print j
				 * 0           5           yes           5 4 3 2 1
				 *             4
				 *             3
				 *             2
				 *             1
				 *     
				 * 1           5           yes           5 4 3 2 
				 *             4
				 *             3
				 *             2
				 */
				System.out.print(j + " "); 
			}
			System.out.println();
		}
	}

}
