package test;

import java.time.LocalDateTime;

public class TestDateTime {
	public static void main(String[] args) {
//		LocalTime time = LocalTime.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//		String formattedTime = time.format(formatter);
//		System.out.println(formattedTime);
//		
		//tính khoảng thoigian giữa 2 thời gian
//		LocalTime time1 = LocalTime.of(10, 30, 0);
//		LocalTime time2 = LocalTime.of(00, 30, 0);
//		long diff = time1.until(time2, java.time.temporal.ChronoUnit.HOURS);
//		System.out.println(diff);
//		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//Tính khoảng thời gian giữa 2 ngày
		LocalDateTime dateTime1 = LocalDateTime.of(2021, 8, 20, 10, 30, 0);
		LocalDateTime dateTime2 = LocalDateTime.of(2021, 8, 21, 00, 00, 0);
		long diff = dateTime1.until(dateTime2, java.time.temporal.ChronoUnit.MINUTES);
		System.out.println(diff);
		
		
	}
}
