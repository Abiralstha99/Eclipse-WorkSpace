
public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'A';
		int numericValue = letter; // numericValue will be 65
		
		System.out.println(numericValue);
		System.out.println((int)'A'); //will print 65
		
		//Adding and subtracting char value 
		char value1 = 'A';
		char value2 = 'B';
		int sum = value1 + value2; // sum = 65 + 66 = 131
		System.out.println(sum);
		
		//char increment and decrement
		System.out.println(++value1); //prints B
		
		
		
		//Comparing char values 
		if (value1 > value2) {
			System.out.println("'A' is greater");
		}
		else {
			System.out.println('B' + " is greater" );
		}
		
	}

}
