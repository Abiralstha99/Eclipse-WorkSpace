/*
 * Abiral Shrestha
 */
import java.util.*;
public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("How many students? ");
		int student = sc.nextInt();
		System.out.println("How many grades? ");
		int grades = sc.nextInt();
		for (int i = 1 ; i<=student ; i++) { //since a student has number of grades 
                                            // we use student as outer loop and grades as inner loop
			double sum = 0;
			for (int j = 1 ; j<=grades ; j++) {
				System.out.println("Enter student " + i + " grade " + j + ": " );
				double marks = sc.nextDouble(); // storing marks in a new variable and keep adding it sum 
				sum = sum + marks;
			}
			System.out.printf("Student %d had the average %.2f", i,sum/grades);
			System.out.println();
		}
	}

}
