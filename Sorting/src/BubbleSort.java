import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5,4,8,3,2,1};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubble (int [] arr) {
		boolean swapped;
		//run the steps n-1 times
		for (int i = 0 ; i< arr.length; i++) {
			swapped = false;
			//for each step, max item will come at the last respective index
			for (int j = 1 ; j<arr.length-i;j++) {
				//swap if the item is smaller than the previous item 
				// if j < j-1 swap
				if (arr[j] < arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			//if you did not swap for a particular valur of i; it means the arrau is sprted hence stop
			if (!swapped) { //!false = true
				break;
			}
		}
	}

}
