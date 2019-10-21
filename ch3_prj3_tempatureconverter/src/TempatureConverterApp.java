import java.util.Scanner;

public class TempatureConverterApp {

	public static void main(String[] args) {
System.out.println("Welcome To Tempature Converter");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter Degrees in Fahrenheit: ");
			
			int fDegree = sc.nextInt();
			
			int  cDegree = ((fDegree -32) * 5/9); ;
		
			
			
			
			//double equation = (int)  (fDegree -32 * 5/9);
			
			System.out.println("Degrees in Celsius: "+cDegree);
			System.out.println("Continue? ");
		choice = sc.next();
		
		
		
		
		

	}
		System.out.println("Bye!");
	}

	}


