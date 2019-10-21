import java.util.Scanner;

public class studentRegistrationAPP {

	public static void main(String[] args) {

		System.out.println("Welcome to the Student Registration Form");
		System.out.println(); // print a blank line
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name:      ");
		String fName = sc.next();
		System.out.println("Enter Last Name:       ");
		String lName = sc.next();
		System.out.println("Enter Year of Birth:   ");
		String bYear = sc.next();

		System.out.println("Welcome:" + fName + " " + lName);

		System.out.println("Your registration is complete.");
		System.out.println("Your temporary Password is " + fName + lName + "*" + bYear);

	}

}
