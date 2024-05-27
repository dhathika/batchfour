package com.vidvaan.bus.date;

import java.sql.Date; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConversionMethods {
	
	public static java.sql.Date getDate(String date) {
		//System.out.println(date);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(date, df);
		Date date1 = Date.valueOf(localDate);
		return date1;
	}
	
	public static String stringDate(java.util.Date date) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String inDate = df.format(date);
		return inDate;
	}
	/*public static void main(String[] args) {
		getDate("12-09-2010");
	}*/
	
	

}
