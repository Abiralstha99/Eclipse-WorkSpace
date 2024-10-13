import java.util.*;
public class ISBN_01 {
	public static void main (String [] args) {
		int sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a nine digit number: ");
		int num = sc.nextInt();
		int a = num;
		for (int i = 9; i>=1;i--) {
			sum = sum + ((a%10)*i);
			a = a/10;
		}
		System.out.println(sum);
		
	}
}
