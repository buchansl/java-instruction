import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		final BigDecimal Interest_calc = new BigDecimal ("0.5");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	System.out.println("Enter Loan Amount: ");
        	String loanamount =   (sc.next());
        	
        	System.out.println("Enter Interest Rate: ");
        	String interestrate = sc.next();
        	
        	 BigDecimal  loanAmount = new BigDecimal( sc.next() );
             loanAmount = BigDecimal(interestrate, 2, RoundingMode.HALF_UP);
        	
        	System.out.println("Loan Amount: "+loanamount);
        	System.out.println("Interest Rate: "+interestrate);
        	
        	
        	
	
        
        
        }
		
		

	}

	private static BigDecimal BigDecimal(String interestrate, int i, RoundingMode halfUp) {
		// TODO Auto-generated method stub
		return null;
	}

}
