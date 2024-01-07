import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2007-10-03");
		LocalDateTime d05 = LocalDateTime.parse("1999-12-15T01:56:25");
		
		Instant d06 = Instant.parse("1999-12-15T01:56:25Z");
		Instant d07 = Instant.parse("1999-12-15T01:56:25-03:00");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault()); 
		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + fmt2.format(d06));
		System.out.println("d07 = " + d07.toString());
	}

}
