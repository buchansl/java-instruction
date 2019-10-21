
public class StaticMethodApp {

	public static void main(String[] args) {
		printWelcomMessage(); 
		int a = sum(4,5);
		System.out.println("sum is  " +a);

	}
	
	private static void printWelcomMessage() {
		// TODO Auto-generated method stub
		
	
		
		System.out.println("welcome to My Method.");
	}
	private static int sum(int a, int b) {
		return a + b;
	}
}

