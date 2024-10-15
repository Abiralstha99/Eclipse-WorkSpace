
public class Mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Math.sin(90));
//		System.out.println(Math.toDegrees(Math.sin(Math.PI)));
		
		//Exponential methods
		
		// meaning e^0
		//System.out.println(Math.exp(0)); 
		
		//ln(1.0) => Math.log(3.5)
		//log(1.0) -> Math.log10(3.5)
		
		//square root and power
		//System.out.println(Math.pow(9, 1/2)); //Integer division
		
		//Rounding methods
		
		//Ceiling of a number : returns the closest greater double value
		System.out.println(Math.ceil(-2.7)); 
		
		//Ceiling of a number : returns the closest smaller double value
		System.out.println(Math.floor(2.7)); 
		
		//Returns the nearest double value
		System.out.println(Math.rint(4.4));
		
		//returns the nearest integer
		System.out.println(Math.round(4.6));
		
		/*
		 * Write a statement that converts 47 degrees to radians and assigns the result to a variable.
		 */
//		double temp = Math.toRadians(47);
//		System.out.println();
		
		/*
           Write a statement that converts PI / 7 to an angle in degrees and assigns the result
           to a variable.
           */
		   double temp = Math.toDegrees(Math.PI/7); 
		   
		   
		/*
           Write an expression that obtains a random integer between 34 and 55. Write an expression 
           that obtains a random integer between 0 and 999. Write an expression that
           obtains a random number between 5.5 and 55.5.
		 */
		   
		   System.out.println(Math.random()*(55-34+1)+34);
		   System.out.println(Math.random()*(1000));
		   System.out.println(Math.random()*(55.5-5.5+1)+5.5);
		
		
		
	}

}
