import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
          //  double miles = sc.nextDouble();
            
            BigDecimal miles = new BigDecimal( sc.next() );
            
            System.out.print("Enter gallons of gas used: ");
           // double gallons = sc.nextDouble();
            BigDecimal gallons = new BigDecimal( sc.next() );
            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
            
            
           // double mpg = miles/gallons;
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
