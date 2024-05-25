package vaccination_process;
import java.util.Scanner;

public class StundentVaccination {

	public static void main(String[] args) {
		System.out.println("Enter Number of Students : ");
		Scanner sc=new Scanner(System.in);
		int numStudents=sc.nextInt();
		String[] student=new String[numStudents];
		int[] age=new int[numStudents];
		Scanner scName = new Scanner(System.in);
		Scanner scAge=new Scanner(System.in);
		for(int i=0;i<numStudents;i++) {
			System.out.println("Enter Name : ");
			student[i] = scName.nextLine();
			System.out.println("Enter Age : ");
			age[i] = scAge.nextInt();
		}
		for(int i=0;i<numStudents;i++) {
			if(age[i]>=15) {
				System.out.println(student[i] + " can receive a vaccine.");
				System.out.println("The Student is now "+age[i]);
			}
			else {
				System.out.println("The age is not fit");
			}
		}
		sc.close();
		scName.close();
		scAge.close();

	}

}
