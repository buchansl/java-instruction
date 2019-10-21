import java.util.Scanner;

public class CommonDivisorCalculator {

	public static void main(String[] args) {
		
System.out.println("Common Divisor Calculator");
		
		Scanner sc = new Scanner (System.in);

		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) 
		{
			System.out.println("Enter First Number:(y-greater) ");
			int y = sc.nextInt();
			System.out.println("Enter Second Number: (x- lesser): ");
			int x = sc.nextInt();
			
	
			{

			

			
			while(x!=0)
			{
				while 
			  (y >= x) {
			     y = y-x;}
			  int temp = x;
			  x = y;
				y = temp;
			     
			
			
			
			
			
			
			
			//System.out.println("Greatest Common Divisor"+cDiv);;
			//double cDiv = sc.nextDouble();	
			//double cDiv = fNum - sNum;}
		//while(fNum!=sNum) 
			//{
		//	  if(fNum >= sNum-1)
			//     fNum = fNum-sNum;
			//  else 
			//   cDiv = (double) (sNum - fNum);  
		//	return;
		
			}
			System.out.println("Greatest Common Divisor"+y);
			System.out.println("Continue? ");
			choice = sc.next();
			

			

		
		
		
			
			}	
		
			System.out.println("bye");
			
}
		sc.close();
	}
}
