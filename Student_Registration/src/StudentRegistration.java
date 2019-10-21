import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		String fName;
		String lName;
		String DOB;
		
		
		System.out.println(" Student Registration");
		System.out.println();
		
		
		Scanner fNamevalue = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		fName = fNamevalue.next();
		
		Scanner lNamevalue = new Scanner (System.in);
		System.out.println("Enter Last Name :");
			lName  = lNamevalue.next();
		
		
		
		Scanner DOBvalue = new Scanner(System.in);
		System.out.print("Enter Year of Birth");
		DOB = DOBvalue.next();
		
	
		System.out.println("Welcome " + fName + " " + lName + "!");
        System.out.println("Your registration is complete.");
        System.out.println("Your temporary password is:" + fName + "*" + DOB);
		
	}
}