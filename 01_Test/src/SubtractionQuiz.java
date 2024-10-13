
public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int) (Math.random()*100);
		int y = (int) (Math.random()*100);
		int a = (int) (Math.random()*2);
		System.out.println(a);
		switch (a) {
		 case 0 :
			 int sum = x+y;
			 System.out.println("The sum of " + x + " and " + y + " is " + sum);
			 break;
			 
		 case 1 :
			 if (y>x) {
				 int temp = x;
				 x = y;
				 y = temp;
			 }
			 int diff = x-y;
			 System.out.println("The difference of " + x + " and " + y + " is " + diff);
			 break;
			 
		default:
			System.out.println("We need 0 or 1");
		}
	}

}
