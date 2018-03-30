package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {

	private static SimpleDateFormat normalDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	private static SimpleDateFormat normalDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	private static SimpleDateFormat numberDayDateFormat = new SimpleDateFormat("yyMMdd");

	public static String toNumberDayDate(Date date) {
		return numberDayDateFormat.format(date);
	}

	public static String toNormalDateFormat(Date date) {
		return normalDateFormat.format(date);
	}

	public static String toNormalDateTimeFormat(Date date) {
		return normalDateTimeFormat.format(date);
	}

	public static void main(String[] args) {
		System.out.println(DateFormatUtil.toNumberDayDate(new Date()));
	}
}
