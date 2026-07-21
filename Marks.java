import java.util.Scanner;

public class Marks{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of students: ");
		int n = input.nextInt();

		int[][] marks = new int [n][3];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<3; j++){
				System.out.println("Enter subject"+ (j+1) + "marks of student" +(i+1));
				marks[i][j] = input.nextInt();
			}
		}
		
		System.out.println("----Menu----");
		System.out.println("1. Update Marks");
		System.out.println("2. Average mark of a Subject");
		System.out.println("3. Average mark of a Student");
		System.out.println("4. Total mark of a Student");

		System.out.println("Enter your choice: ");
		int choice = 

	}
}

		
