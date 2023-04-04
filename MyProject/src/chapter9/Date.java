package chapter9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1990,10,8);
		LocalDate now = LocalDate.now();
		System.out.println("오늘 : " + now);
		System.out.println("생일 : " + birthday);
		
		long days =ChronoUnit.DAYS.between(birthday, now);
		System.out.println(days);
	}

}
