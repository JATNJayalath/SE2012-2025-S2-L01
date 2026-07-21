import java.util.Scanner;

public class Welcome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first name: ");
		String firstname = input.nextLine();
		
		System.out.println("Enter the last name: ");
		String lastname = input.nextLine();

		System.out.println("Welcome to the Second Year " + firstname + " " + lastname );

		input.close();

	}
}


