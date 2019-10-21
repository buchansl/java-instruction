import java.util.Scanner;
import java.text.NumberFormat;
import java.util.InputMismatchException;

public class CommonDivisorApp {

	public static void main(String[] args) {

		System.out.println("Common Divisor Calculator");

		Scanner sc = new Scanner(System.in);

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			int y = getint("Enter First Number:(y-greater) ", sc);

			int x = getint("Enter Second Number: (x- lesser): ", sc);

			while (x != 0) {
				while (y >= x) {
					y = y - x;
				}
				int temp = x;
				x = y;
				y = temp;

			}
			System.out.println("Greatest Common Divisor" + y);
			System.out.println("Continue? ");
			choice = sc.next();

		}
		sc.close();
		System.out.println("bye");
	}

	private static int getint(String prompt, Scanner scan) {
		boolean isValid = false;
		int i = 0;
		while (!isValid)
			try {

				System.out.println(prompt);
				i = scan.nextInt();
				isValid = true;

				return i;
			}

			catch (InputMismatchException ime) {

			}
		System.out.println("Invalid entry. Try again.");
		return i;

	}
}
