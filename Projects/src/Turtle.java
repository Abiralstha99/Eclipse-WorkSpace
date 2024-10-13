
public class Turtle {

	public static void main(String[] args) {
		
		int  leftSpace  = 7;
		int  rightSpace = 7;
		
		initialSetup (leftSpace, rightSpace);
		
		while (rightSpace != 0)
		{
//			sleep (2.0);
			swim ();
		}
		
		
	}
	
	public static void initialSetup (int left, int right)
	{
		int  leftSpace  = left;
		int  rightSpace = right;
		String turtle     = "T";
		
		String river = "|";
		
		for (int i = 0; i < leftSpace; i++)
		{
			river += " ";
		}
		
		river += turtle;
		
		for (int i = 0; i < rightSpace; i++)
		{
			river += " ";
		}
		
		river += "|";
		
		System.out.println(river);
	}
	
	public static void swim ()
	{
		int leftSpace = (int) ( 8 * Math.random() );
		int rightSpace = 7 - leftSpace;
		
		String turtle     = "T";
		
		String river = "|";
		
		for (int i = 0; i < leftSpace; i++)
		{
			river += " ";
		}
		
		river += turtle;
		
		for (int i = 0; i < rightSpace; i++)
		{
			river += " ";
		}
		
		river += "|";
		
		System.out.println(river);
	} 
}
