//Abiral Shrestha
import java.util.*;
public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		  int sum=0;    
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first 9 digits:");
		
		num = sc.nextInt();
		int output = num; // keeping num's value in a separate variable cause num's value will change during the loop
		
		for (int i = 9; i>=1 ;i--) {  // using for loop to calculate the sum // reversing the loop because we get the last digit after modulus division and we need to multiply it by 9ffffff 
			sum = sum + (num%10)*i;   // num%10 gives us the reminder 
			num = num/10;
		}
		sum = sum % 11;
		if (sum==10) {
			System.out.println("The ISBN number is " + output + "X");
		}
		else {
			System.out.println("The ISNB number is " + output + sum);
		}
	}
}
