package service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {
	public static String formatLocalDateTimeToString(LocalDateTime localDateTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return localDateTime.format(formatter);
	}

	public static double tinhKhoangThoiGian(LocalDateTime time1, LocalDateTime time2) {
		long minute= time1.until(time2, java.time.temporal.ChronoUnit.MINUTES);
		double hour = minute/60.0;
		return hour;
	}
	
	public static String tinhKhoanThoiGian(LocalDateTime time1, LocalDateTime time2) {
		long minute = time1.until(time2, java.time.temporal.ChronoUnit.MINUTES);
		int hour = (int) (minute / 60);
		int min = (int) (minute % 60);
		return hour +":" + min;
	}
	public static String formatLayGio(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return localDateTime.format(formatter);
		
	}
}
