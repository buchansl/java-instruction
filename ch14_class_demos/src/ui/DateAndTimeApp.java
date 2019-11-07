package ui;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTimeApp {
	
	public static void main(String[]args) {
		// current date and time
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate halloween2019 = LocalDate.of(2019, 10, 31);
		System.out.println(halloween2019);
		LocalDate christmas2019 = LocalDate.of(2019, 12, 25);
		System.out.println(christmas2019);
		LocalDateTime thanksgiving2019 = LocalDateTime.of(2019, 11, 28, 0, 0);
		System.out.println(thanksgiving2019);
		LocalDateTime demoday2019 = LocalDateTime.parse("2019-12-17T14:00:00");
		System.out.println(demoday2019);
		System.out.println("day of christmas:"+christmas2019.getDayOfMonth());
		System.out.println("compare date/times");
		System.out.println(halloween2019.isBefore(christmas2019));
		System.out.println(christmas2019.compareTo(halloween2019));
		//adjusters
		LocalDate newDate = halloween2019.withMonth(11);
		System.out.println(newDate);
		LocalDate date1= LocalDate.of(2017, 2, 28);
		//LocalDate newDate1 = date1.withDayOfMonth(29);// throws exception
		//adding/subtracting
		//date 1 to current date??
		LocalDate newDate2 = date1.plusYears(2).plusMonths(8).minusDays(6);
		System.out.println(newDate2);
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(df.format(newDate2));
		
	}
}

