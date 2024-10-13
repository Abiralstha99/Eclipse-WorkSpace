import java.util.Arrays;

public class TwoDimensionBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int target = 14;
		System.out.println(Arrays.toString(search(arr,target)));
	}
	
	static int[] search (int [][] matrix, int target) {
		int row = 0;
		int col = matrix.length-1;
		
		//because since we are reducing the row and col after every iteration
		while (row < matrix.length && col>=0 ) {
			if (matrix[row][col] == target) {
				return new int[] {row,col};
			}
			if (matrix[row][col]<target) {
				row++;
			}
			else {
				col--;
			}
		}
		return new int[] {-1,-1};
	}
}
