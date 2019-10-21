import java.util.Scanner;

public class AreaAndPerimeterCalculatorApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Area and Perimeter App");
		System.out.println(); // print a blank line
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		choice.equalsIgnoreCase("y");
		System.out.println("Enter Length: ");
		double lSize = sc.nextDouble();
		System.out.println("Enter Width: ");
		double wSize = sc.nextDouble();
		double qArea = lSize * wSize;
		double pSize = (2 * wSize) + (2 * lSize);
		System.out.println("Area:	" +qArea);
		System.out.println("Perimeter: " +pSize);

		System.out.println("Continue? ");
		choice = sc.next();
	}

}
