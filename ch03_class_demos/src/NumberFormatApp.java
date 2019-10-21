import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		double d1 =.25;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		NumberFormat pf = NumberFormat.getPercentInstance();
		
		System.out.println(cf.format(d1));
		System.out.println(pf.format(d1));
		

	}

}
