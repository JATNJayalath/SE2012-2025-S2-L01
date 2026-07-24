import java.util.Scanner;

public class Marks{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = input.nextInt();

		int[][] marks = new int [n][3];
		
		System.out.println("Subject IDs: 1-Mathematics, 2-Chemistry, 3-Physics");

		for(int i=0; i<n; i++){
			for(int j=0; j<3; j++){
				System.out.print("Enter subject"+ (j+1) + " " + "marks of student" +(i+1)+": ");
				marks[i][j] = input.nextInt();
			}
		}
		int choice;

		do{
			
			System.out.println("\n----Menu----");
			System.out.println("1. Update Marks");
			System.out.println("2. Average mark of a Subject");
			System.out.println("3. Average mark of a Student");
			System.out.println("4. Total mark of a Student");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			switch(choice){
				case 1:
					System.out.print("Enter student ID: ");
					int studentID = input.nextInt();
					System.out.print("Enter subject ID: ");
					int subjectID = input.nextInt();
				
					System.out.print("Enter New Mark: ");
					int newMark = input.nextInt();

					marks[studentID-1][subjectID-1]=newMark;

					System.out.println("Mark updated successfully");
				
					break;

				case 2:
					System.out.print("Enter subject ID: ");
					subjectID = input.nextInt();

					int sumSubject = 0;

					for(int i=0; i<n; i++){
						sumSubject += marks[i][subjectID - 1];
					}

					System.out.println("Average: " + (double)sumSubject / n);

					break;
				case 3:
					System.out.print("Enter student ID(1-" + n + "): ");
					studentID = input.nextInt();

					int sumStudent = 0;

					for(int j=0; j<3; j++){
						sumStudent += marks[studentID -1][j];
					}

					System.out.println("Average mark: " + (double)sumStudent / 3);

					break;
				case 4:
					System.out.print("Enter student ID(1-" + n + "):");
					studentID = input.nextInt();

					int total = 0;

					for(int j=0; j<3; j++){
						total += marks[studentID - 1][j];
					}

					System.out.println("Total Marks: " + total);
					
					break;
				case 5:
					System.out.println("Exit");
					break;

				default:
					System.out.println("Invalid Choice");
			}

		}while(choice != 5);

	input.close();

	}
}

		
