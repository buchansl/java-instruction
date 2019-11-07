package ui;

public class TernaryDemoApp {

	public static void main(String[] args) {
		int num = 10;
		String msg= "";
				if(num>10) {
			msg = "Number greter than 10";
			
		}
		else {
			msg = "number less then or equal to 10.";
		}
		System.out.println(msg);
		msg = (num >+10)?"Number is Greater than or equal to ten":
						"Number is less than 10";
		System.out.println(msg);
	}

}
