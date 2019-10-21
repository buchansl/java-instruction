import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to travel Time Calculator");
		
		Scanner sc = new Scanner (System.in);

	
	String choice = "y";
	
	while (choice.equalsIgnoreCase("y")) 
	{
	
	System.out.println("Enter Miles: ");
	double miles = sc.nextDouble();
	System.out.println("Enter MPH:  ");
	double mph = sc.nextDouble();
	
	double hours = miles / mph;
	int min = (int) (hours*60);
	int hoursInt = min / 60;
	min %= 60;
	
	
	System.out.println("Estimated Travel Time:");
	System.out.println("================");
	System.out.println("Hours:"+hoursInt);
	System.out.println("Minutes: "+min);
	
	
	
	
	System.out.println("Continue? ");
	choice = sc.next();
	
	
	
	
	
	
		sc.close();
		}
	System.out.println("Bye!");
	}

	}
