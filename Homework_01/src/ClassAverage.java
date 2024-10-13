import java.util.*;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double HomeWork, FourthHour, ClassWork, Attendance, Tests, FinalExam;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your marks in homework: ");
		HomeWork = sc.nextDouble();
		System.out.println("Enter your marks in FourthHour: ");
		FourthHour = sc.nextDouble();
		System.out.println("Enter your marks in Attendance: ");
		Attendance = sc.nextDouble();
		System.out.println("Enter your marks in Classwork: ");
		ClassWork = sc.nextDouble();
		System.out.println("Enter your marks in Tests: ");
		Tests = sc.nextDouble();
		System.out.println("Enter your marks in FinalExam: ");
		FinalExam = sc.nextDouble();
		
		double HomeWork1, FourthHour1, ClassWork1, Attendance1, Tests1, FinalExam1;
		HomeWork1 = 20.0/100 * HomeWork;
		FourthHour1 = 10.0/100 * FourthHour;
		ClassWork1 = 12.0/100 * ClassWork;
		Attendance1 = 2.0/100 * Attendance;
		Tests1 = 36.0/100 * Tests;
		FinalExam1 = 20.0/100 * FinalExam;
		
		double marks;
		marks = (HomeWork1 + FourthHour1 + ClassWork1 + Attendance1 + Tests1 + FinalExam1);
		System.out.println("Your Course Average is " + marks);
		sc.close();
		}
}
