package br.com.alura;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import org.junit.Test;

public class DataTest {

	@Test
	public void dateTest() {
		LocalDate data = LocalDate.of(1983, 11, 4);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//System.out.println(data.format(formatter));
		assertEquals("04/11/1983", data.format(formatter));
	}
	
	@Test
	public void dateTimeTest() {
		LocalDateTime dateTime = LocalDateTime.of(2017, 1, 17, 23, 04, 30);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm ss");
		//System.out.println(dateTime.format(formatter));
		assertEquals("17/01/2017 23:04 30", dateTime.format(formatter));
	}
	
	@Test
	public void formatStyleTest() {
		LocalDateTime dateTime = LocalDateTime.of(2017, 1, 17, 23, 04, 30);
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		//System.out.println(dateTime.format(formatter));
		assertEquals("17/01/2017 23:04:30", dateTime.format(formatter));
	}
	
	@Test
	public void formatStyleWithLocaleEnglishTest() {
		LocalDateTime dateTime = LocalDateTime.of(2017, 1, 17, 23, 04, 30);
		DateTimeFormatter formatter = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(Locale.ENGLISH);
		//System.out.println(dateTime.format(formatter));
		assertEquals("Jan 17, 2017 11:04:30 PM", dateTime.format(formatter));
	}
	
	@Test
	public void formatStyleWithLocalePtBrTest() {
		LocalDateTime dateTime = LocalDateTime.of(2017, 1, 17, 23, 04, 30);
		DateTimeFormatter formatter = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(new Locale("pt", "br"));
//		System.out.println(dateTime.format(formatter));
		assertEquals("17/01/2017 23:04:30", dateTime.format(formatter));
	}
	
	@Test
	public void plusAndMinusDaysTest() {
		LocalDateTime dateTime = LocalDateTime.of(2017, 1, 17, 23, 04, 30);	
		
		DateTimeFormatter formatter = DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(new Locale("pt", "br"));
		//System.out.println(dateTime.plusDays(3).format(formatter));
		assertEquals("20/01/2017 23:04:30", dateTime.plusDays(3).format(formatter));
	}
	
	@Test
	public void plusAndMinusHourTest() {
		LocalTime time = LocalTime.of(17, 40, 20);
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);		
		//System.out.println(time.plusHours(3).plusMinutes(10).format(formatter));		
		assertEquals("20:50:20", time.plusHours(3).plusMinutes(10).format(formatter));
	}
}
